package com.sreelucodes.dsa.patterns;

public class ReverseTriangleNumberPattern {
    public static void main(String[] args) {
        int n =5;
        printReverseTriangleNumberPattern(n);
    }

    private static void printReverseTriangleNumberPattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n-i+1;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
