package com.sreelucodes.dsa.patterns;

public class DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        printDiamondPattern(n);
    }

    private static void printDiamondPattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }//reverseTriangle
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*n-(2*i+1));j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
