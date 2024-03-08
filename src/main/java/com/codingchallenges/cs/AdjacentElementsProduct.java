package com.codingchallenges.cs;
/*
/Given an array of integers,
find the pair of adjacent elements
that has the largest product and return that product.
 */

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class AdjacentElementsProduct {

    public static void main(String[] args) {

        int[] array = {-23, 4, -3, 8, -12};
        log.info(String.valueOf(getAdjacentElementsMaxProduct(array)));
    }

    public static int getAdjacentElementsMaxProduct (int[] inputArray){

        int maxProduct = Integer.MIN_VALUE;

        for (int i = 0; i < inputArray.length - 1; i++){

            if(inputArray[i] * inputArray[i + 1] > maxProduct){

                int product = inputArray[i] * inputArray[i + 1];

                if(product > maxProduct){
                    maxProduct = product;
                }
            }
        }
        return maxProduct;
    }
}
