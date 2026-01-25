package com.sreelucodes.dsa.patterns;

public class AnagramTrianglePattern {
    public static void main(String[] args) {
        int n=5;
        printAnagramTrianglePattern(n);
    }

    private static void printAnagramTrianglePattern(int n) {
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(char j = 'A'; j<(char)('A'+i);j++){
                System.out.print(j);
            }
            for(char j= (char)('A'+i);j>='A';j--){
                System.out.print(j);
            }
            System.out.println();

        }
    }
}
