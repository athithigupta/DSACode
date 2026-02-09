package com.sreelucodes.dsa.recursion.arrays;

public class SortedArrayOrNot {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,7,8,9};
        System.out.println(isArraySortedOrNot(arr));
    }

    private static boolean isArraySortedOrNot(int[] arr) {
        return helper(arr,0);
    }

    private static boolean helper(int[] arr, int arrstartIndex) {
        if(arrstartIndex == arr.length-1){
            return true;
        }
        return (arr[arrstartIndex] < arr[arrstartIndex+1]) && helper(arr,arrstartIndex+1)  ;

    }
}
