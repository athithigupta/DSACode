package com.sreelucodes.dsa.patterns;

public class AlphabetDescTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        printAlphabetDescTrianglePattern(n);
    }

    private static void printAlphabetDescTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            for(char j= (char)('A'+n-i-1); j<'A'+n ; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
