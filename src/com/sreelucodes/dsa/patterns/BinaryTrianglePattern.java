package com.sreelucodes.dsa.patterns;

public class BinaryTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        printBinaryTrianglePattern(n);
    }

    private static void printBinaryTrianglePattern(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print((j%2)==0?"0":"1");
            }
            System.out.println();
        }
    }

}
