package com.sreelucodes.dsa.patterns;

import java.util.Scanner;

public class BoxPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the box pattern: ");
        int n = scanner.nextInt();
        printBoxPattern(n);
        scanner.close();
    }

    private static void printBoxPattern(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
