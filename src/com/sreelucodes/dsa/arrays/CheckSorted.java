package com.sreelucodes.dsa.arrays;

public class CheckSorted {
    public static void main(String[] args) {
     int[] arr = {1,2,3,4,5};
     System.out.println(isSortedAsc(arr));
    }

    private static boolean isSortedAsc(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

}
