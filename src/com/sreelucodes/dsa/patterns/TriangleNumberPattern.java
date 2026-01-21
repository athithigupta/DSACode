package com.sreelucodes.dsa.patterns;

import java.util.Scanner;

public class TriangleNumberPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle number pattern: "); // You can change the height of the triangle here
        int n = scanner.nextInt();
        scanner.close();
        printTriangleNumberPattern(n);
    }

    private static void printTriangleNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
