package com.sreelucodes.dsa.patterns;

public class RightArrowPattern {
    public static void main(String[] args) {
        int n=5;
        printRightArrowPattern(n);
    }

    private static void printRightArrowPattern(int n) {
        for(int i=1;i<(2*n);i++){
            int stars = (i<n)?i:2*n-i;
            for(int j=1;j<=stars;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
