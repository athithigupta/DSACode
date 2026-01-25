package com.sreelucodes.dsa.patterns;

public class AlphabetTriangleDescPattern {
    public static void main(String[] args) {
        int n=5;
        printAlphabetTriangleDescPattern(n);
    }

    private static void printAlphabetTriangleDescPattern(int n) {
        for(int i=0;i<n;i++){
            for(char j = (char) ('A'+n-i-1); j>='A'; j--){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
