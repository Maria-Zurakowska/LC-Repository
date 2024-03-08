package com.codingchallenges.cs;

import lombok.extern.slf4j.Slf4j;

/**
 * Below we will define an n-interesting polygon. Your task is to find the area of a polygon for a given n.
 * A 1-interesting polygon is just a square with a side of length 1.
 * An n-interesting polygon is obtained by taking the n - 1-interesting polygon and appending 1-interesting polygons to its rim, side by side.
 *
 * Example
 * n = 1 is a square
 * For n = 2, the output should be solution(n) = 5;  | 1 square with its rims surrounded by a square per rim
 * For n = 3, the output should be solution(n) = 13. | (n - 1) –> 2, we take the shape for n = 2 and add a square to every rim etc.
 */

@Slf4j
public class ShapeArea {

    public static void main(String[] args) {

        int number = 4;
        log.info(String.valueOf(getShapeArea(number)));
    }

    public static int getShapeArea(int n){

        if(n == 1) return 1;

        return n*n + ((n - 1) * (n - 1));
    }
}
