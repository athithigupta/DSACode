package com.sreelucodes.dsa.patterns;

public class AlphabetASCTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        printAlphabetASCTrianglePattern(n);
    }

    private static void printAlphabetASCTrianglePattern(int n) {
        for(int i=0;i<=n;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
