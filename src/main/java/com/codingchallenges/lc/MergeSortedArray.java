package com.codingchallenges.lc;

public class MergeSortedArray {

    public static void main(String[] args) {

        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        int i = 0; // index for nums1
        int j = 0;// index for nums2
        int k = 0;// index for result
        // m --> number of elements in nums1
        // n --> number of elements in nums2

        while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;

            } else if (nums1[i] > nums2[j]) {
                result[k] = nums2[j];
                j++;
                k++;

            } else if (nums1[i] == nums2[j]) {
                result[k] = nums1[i];
                i++;
                k++;
            }
        }
        if (i >= m) {
            while (j < n) {
                result[k] = nums2[j];
                j++;
                k++;
            }
        }
        if (j >= n) {
            while (i < m) {
                result[k] = nums1[i];
                i++;
                k++;
            }
        }
        for (int l = 0; l < nums1.length; l++) {
            nums1[l] = result[l];
        }
    }
}
