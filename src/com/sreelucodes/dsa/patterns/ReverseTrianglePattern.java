package com.sreelucodes.dsa.patterns;

public class ReverseTrianglePattern {
    public static void main(String[] args) {
        int n = 5;
        printReverseTrianglePattern(n);
    }

    private static void printReverseTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
