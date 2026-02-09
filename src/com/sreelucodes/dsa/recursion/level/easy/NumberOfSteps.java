package com.sreelucodes.dsa.recursion.level.easy;

public class NumberOfSteps {
    public static void main(String[] args) {
        int n = 14;
        System.out.println(findNumberOfSteps(n));
    }

    private static int findNumberOfSteps(int n) {
       return helper(n,0);
    }

    private static int helper(int n, int noOfSteps) {
        if (n == 0) {
            return noOfSteps;
        }
        if (n % 2 == 0) {
            return helper(n / 2, noOfSteps + 1);
        }
        return helper(n - 1, noOfSteps + 1);

    }

}
