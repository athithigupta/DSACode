package com.sreelucodes.dsa.patterns;

public class ReverseOddTrianglePyramidPattern {
    public static void main(String[] args) {
        int n =5;
        printReverseOddTrianglePyramidPattern(n);
    }

    private static void printReverseOddTrianglePyramidPattern(int n) {
        //9
        //space 7 stars
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
