package com.codingchallenges.lc;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 123456;
        List<Integer> list = new ArrayList<>();

        for (Integer i : list){
            System.out.println(i);
        }

        numberToListOfDigits(n, list);
        for(Integer nb : list){
            System.out.println(nb);
        }
        System.out.println(digitSquareSum(list));
    }

    public static List<Integer> numberToListOfDigits(int n, List<Integer> numberDigits){

        if(n != 0) {
            int temp = n % 10;
            n = n /10;
            numberToListOfDigits(n, numberDigits);
            numberDigits.add(temp);
        }
        return numberDigits;
    }

    public static int digitSquareSum(List<Integer> digitsList){

        int sum = 0;

        for (int i = 0; i < digitsList.size(); i++) {
            sum = sum + digitsList.get(i) * digitsList.get(i);
        }
        return sum;
    }
}
