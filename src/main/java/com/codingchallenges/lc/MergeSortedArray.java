package com.codingchallenges.lc;

import java.util.Arrays;


public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

        int[] array = new int[m + n];

        for (int i = 0; i < nums1.length; i++) {

            array[i] = nums1[i];
        }

        for (int i = 0; i < nums2.length; i++) {

            array[n + i] = nums2[i];
        }
        Arrays.sort(array);

        System.out.println(Arrays.toString(array));
    }
}
