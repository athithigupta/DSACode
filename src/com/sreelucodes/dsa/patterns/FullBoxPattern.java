package com.sreelucodes.dsa.patterns;

public class FullBoxPattern {
    public static void main(String[] args) {
        int n = 5; // You can change the size of the box here
        printFullBoxPattern(n);
    }

    private static void printFullBoxPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
