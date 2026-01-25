package com.sreelucodes.dsa.patterns;

public class OddPyramidTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printOddPyramidTrianglePattern(n);
    }

    private static void printOddPyramidTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            int space = n-i-1;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
