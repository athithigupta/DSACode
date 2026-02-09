package com.sreelucodes.dsa.patterns;

public class ContinuousNumberTrianglePattern {
    public static void main(String[] args) {
        int n = 5; // You can change the height of the triangle here
        printContinuousNumberTrianglePattern(n);
    }

    private static void printContinuousNumberTrianglePattern(int n) {
    int count=1;
    for(int i=0;i<n;i++){
        for(int j=0;j<=i;j++){
            System.out.print(count++ + " ");
        }
        System.out.println();
    }
    }
}
