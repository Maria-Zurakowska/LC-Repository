package com.codingchallenges.cs;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CheckIsPalindromeStringRecursion {

    public static void main(String[] args) {

        String s = "MADAM"; // litery musza byc tej samej wielkosci M i m to nie to samo
        log.info(String.valueOf(checkIsPalindromeStringRecursion(s, 0)));

    }

    public static boolean checkIsPalindromeStringRecursion(String str, int i){

        boolean isPalindrome = true;

        if (i >= str.length() / 2) return isPalindrome;

        if(str.charAt(i) != str.charAt((str.length() - i - 1))) return isPalindrome = false;

        return checkIsPalindromeStringRecursion(str, i + 1);
    }
}
