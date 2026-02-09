package com.sreelucodes.dsa.maths;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to count digits : ");
        int number = scanner.nextInt() ;
        scanner.close();

        System.out.println("The number of digits in "+number+" is "+countDigitsLog(Math.abs(number)));
    }

    private static int countDigits(int number) {
        int count =0;
        if(number==0) return 1;
        while(number>0){
            number = number/10;
            count++;
        }
        return count;

    }
    private static int countDigitsLog(int n){
        if(n==0){return 1;}
        return (int)Math.log10(n)+1;
    }
}
