package com.sreelucodes.dsa.maths;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check for reverse number : ");
        int number = scanner.nextInt();

        System.out.println("The reversed number for the original number "+number+" is "+reverseNumber(number));

        scanner.close();
    }

    //Different Input: 1234, 1000, 0, 98765
    //Expected Output: 4321, 1, 0, 56789
    private static int reverseNumber(int number) {
        int reversedNumber = 0;
        while(number>0){
            int lastDigit = number%10;
            reversedNumber = reversedNumber*10+lastDigit;
            number = number/10;
        }
        return reversedNumber;
    }

}
