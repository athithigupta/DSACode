package com.sreelucodes.dsa.maths;

import java.util.Scanner;
import java.util.logging.Logger;


public class FindGCD {
    //add logger
    private static final Logger logger = Logger.getLogger(FindGCD.class.getName());

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        logger.info("Enter 2 numbers for GCD: ");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();

        logger.info("GCD for " + num1 + " and " + num2 + " is " + findGCD(num1, num2));

        logger.info("GCD using recursive approach for " + num1 + " and " + num2 + " is " + findGCDRecursive(num1, num2));

        scanner.close();


    }

    //Different Input: (48, 18), (56, 98), (101, 10), (0, 5), (-48, 18)
    //Expected Output: 6, 14, 1, 5, 6
    //Approach: Euclidean Algorithm

    private static int findGCD(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);

        if (num2 == 0) {
            return num1;
        }

        while(num2 != 0){
            int temp = num2;
            num2 = num1%num2;
            num1 = temp;
        }
        return num1;
    }

    //recursive approach
    private static int findGCDRecursive(int num1, int num2) {
        num1 = Math.abs(num1);
        num2 = Math.abs(num2);
        // Recursive case: GCD(a, b) = GCD(b, a % b)
        return (num2 == 0) ? num1 : findGCDRecursive(num2, num1 % num2);
    }

}