package com.codingchallenges.lc;
import java.util.Arrays;

public class MergeSortedArraySortMethod {

    public static void main(String[] args) {

        int[] nums1 = {1,2,3};
        int m = 3;

        int[] nums2 = {2,5,6};
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n){

        for (int i = 3, j = 0; i < nums1.length; i++, j++) {
            nums1[i] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}
