package com.codingchallenges.cs;

public class AdjacentElementsProductMathMax {

    public static void main(String[] args) {

        int[] nums = new int[] { -23, 4, -3, 8, -12 };

        int res = nums[0] * nums[1];
        for (int i = 2; i < nums.length; i++) {
            res = Math.max(res, nums[i - 1] * nums[i]);
        }

        System.out.println("Res: " + res);
    }
}
