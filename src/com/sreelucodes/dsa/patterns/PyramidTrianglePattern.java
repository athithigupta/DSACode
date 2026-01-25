package com.sreelucodes.dsa.patterns;

public class PyramidTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printPyramidTrianglePattern(n);
    }

    private static void printPyramidTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            int space = n-i-1;
            for(int j=0;j<space;j++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println(" ");
        }
    }
}
