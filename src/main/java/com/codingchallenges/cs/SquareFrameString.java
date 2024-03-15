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

        String[] array1D = getSquareFrameString1D(n);
        String[][] array2D = getSquareFrameString2D(n);

            for(String row : array1D){
                System.out.println(row);
            }

            Arrays.stream(array2D)
                    .map(row -> String.join(" ", row))
                    .forEach(System.out :: println);
    }

    public static String[][] getSquareFrameString2D(int n) {

        String[][] array = new String[n][n];

        for (int i = 0; i < n; i++){

            for(int j = 0; j < n; j++){

                if(i == 0 || i == n-1){
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

    public static String[] getSquareFrameString1D(int n){

        String[] array = new String[n];

        for (int i = 0; i < n; i++){

            String row = "";

            for(int j = 0; j < n; j++){

                if(i == 0 || i == n-1){
                    row = row + "*";

                } else if(j == 0 || j == n-1 ){
                    row = row + "*";

                } else {
                    row = row + " ";
                }
            }
            array[i] = row;
        }
        return array;
    }
}
