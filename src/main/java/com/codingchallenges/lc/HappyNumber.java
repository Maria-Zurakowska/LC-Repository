package com.codingchallenges.lc;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 19;

        System.out.println(isHappy(n));
    }

    public static List<Integer> numberToListOfDigits(int n, List<Integer> numberDigits) {

        if (n != 0) {
            int temp = n % 10;
            n = n / 10;
            numberToListOfDigits(n, numberDigits);
            numberDigits.add(temp);
        }
        return numberDigits;
    }

    public static int digitSquareSum(List<Integer> digitsList) {

        int sum = 0;

        for (int i = 0; i < digitsList.size(); i++) {
            sum = sum + digitsList.get(i) * digitsList.get(i);
        }
        return sum;
    }

    public static boolean isHappy(int n) {

        int temp = n;

        if (temp < 10) { // Base case for recursion: if temp is a digit AND
            if (temp == 1 || temp == 7) {  return true;  // if that digit is 1 or 7 ==> the number is 'happy'
            } else return false;
        }

        List<Integer> list = new ArrayList<>();
        List<Integer> digitsList = numberToListOfDigits(temp, list);

        int squareSum = digitSquareSum(digitsList);
        temp = squareSum;
        digitsList.clear();

        return isHappy(temp);
    }
}
