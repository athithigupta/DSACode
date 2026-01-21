package com.sreelucodes.dsa.patterns;

import java.util.Scanner;

public class TrianglePattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the triangle pattern: "); // You can change the height of the triangle here
        int n = scanner.nextInt();
        scanner.close();
        printTrianglePattern(n);
    }

    private static void printTrianglePattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
