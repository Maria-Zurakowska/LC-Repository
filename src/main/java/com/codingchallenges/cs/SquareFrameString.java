package com.codingchallenges.cs;

import lombok.extern.slf4j.Slf4j;

import java.util.Arrays;

/* Given an integer 'n', your task is to create a square frame of size 'n',
 represented as an array of Strings. The frame should consist of empty space,
 enclosed by lines made of '*' characters as follows.
 Note: You are not expected to provide the most optimal solution, but a solution with time
 complexity not worse than O(n3).
*
* Example
 n = 2;     n = 5           itd.
 [          [
 "**",      "*****",
 "**"       "*   *",
 ]          "*   *",
*           "*   *",
*           "*****",
*
* */
@Slf4j
public class SquareFrameString {

    public static void main(String[] args) {

        int n = 4;

        log.info(Arrays.deepToString(getSquareFrameString(n)));

    }

    public static String[][] getSquareFrameString(int n) {

        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if(i == 0 || i == n-1){ // wiersze
                    array[i][j] = "*";
                } else if(j == 0 || j == n-1 ){
                    array[i][j] = "*";

                } else {
                    array[i][j] = " ";
                }


            }

        }


        return array;
    }

}
