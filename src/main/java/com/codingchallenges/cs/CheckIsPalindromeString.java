package com.codingchallenges.cs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckIsPalindromeString {

    public static void main(String[] args) {

        String str = "aabaa";

        log.info(String.valueOf(isPalindromeString(str)));
    }

    public static boolean isPalindromeString(String word) {

        boolean isPalindrome = true;

        if (word != null && !word.isEmpty()) {

            char[] array = word.toCharArray();

            for (int i = 0; i < array.length / 2; i++) {

                array[i] = Character.toLowerCase(array[i]);

                if (array[i] != array[(array.length - 1) - i]) {

                    isPalindrome = false;
                    break;
                }
            }
        }
        return isPalindrome;
    }
}
