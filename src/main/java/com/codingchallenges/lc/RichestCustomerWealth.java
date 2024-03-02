package com.codingchallenges.lc;

public class RichestCustomerWealth {

    public static void main(String[] args) {

        int[][] accounts = {

                {1, 5},
                {7, 3},
                {3, 5}
        };

        System.out.println(maximumWealth(accounts));
    }

    public static int maximumWealth(int[][] accounts) {

        int maximumWealth = 0;

        for (int i = 0; i < accounts.length; i++) {

            int currentWealth = 0;

            for (int j = 0; j < accounts[i].length; j++) {

                currentWealth = currentWealth + accounts[i][j];
            }

            if (currentWealth > maximumWealth) {
                maximumWealth = currentWealth;
            }
        }
        return maximumWealth;
    }
}
