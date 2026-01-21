package com.sreelucodes.dsa.maths;

import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to check for palindrome : ");
        int number = scanner.nextInt();

        System.out.println(isPalindrome(number) ? number + " is a Palindrome Number" : number + " is not a Palindrome Number");

        scanner.close();
    }

    //Different Input: 121, -121, 10, 12321
    //Expected Output: 121 is a Palindrome Number, -121 is not a Palindrome Number,
    //10 is not a Palindrome Number, 12321 is a Palindrome Number
    //Approach: Reverse the number and compare with original number
    private static boolean isPalindrome(int number) {
        int originalNumber = number;
        int reversedNumber = 0;

        while (number != 0) {
            int lastDigit = number%10;
            reversedNumber = reversedNumber*10+lastDigit;
            number = number/10;
        }
        return reversedNumber == originalNumber;
    }
}
