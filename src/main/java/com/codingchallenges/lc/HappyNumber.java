package com.codingchallenges.lc;

import java.util.ArrayList;
import java.util.List;

public class HappyNumber {

    public static void main(String[] args) {

        int n = 19;

        System.out.println(isHappy(n));
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

    public static boolean isHappy(int n){

            int temp = n;

            if(temp < 10) { // Dlaczego < 10, chodzi o to, ze gdy liczba jest pojedyncza, konczymy rekursje gdy liczba == 1 i dla == 7 wynik koncowy w rekursji tez jest happy
                if (temp == 1 || temp == 7) { return true; //dla reszty liczb tak nie jest, bez tego mialam problem infinite loop a potem stack overflow.
                } else return false;
            }

        List<Integer> list = new ArrayList<>(); // pusta lista

        List<Integer> digitsList = numberToListOfDigits(temp, list);// liczba zamieniona na liste cyfr z tej liczby {1,2,3,4,5,6}, List<Integer> list

        int squareSum = digitSquareSum(digitsList);// suma kwadratow cyfr z liczby ||| {1,2,3,4,5,6} --> 1kw,2kw,3kw,4kw,5kw,6kw = 91

        temp = squareSum;
        digitsList.clear(); // czyszcze liste {1,2,3,4,5,6} --> teraz PUSTA
//.test
        return isHappy(temp);
    }
}
