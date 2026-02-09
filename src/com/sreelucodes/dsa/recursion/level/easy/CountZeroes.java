package com.sreelucodes.dsa.recursion.level.easy;

public class CountZeroes {
    public static void main(String[] args) {
        int n= 20405;
        System.out.println(findNoOfZeroes(n));
    }

    private static int findNoOfZeroes(int n) {
        if(n==0){return 1;}
        return helper(n,0);
    }

    private static int helper(int n, int count) {
        if(n==0){
            return count;
        }
        int rem = n%10;
        if(rem==0){
            return helper(n/10,count+1);
        }
        return helper(n/10,count);
    }
}
