package com.sreelucodes.dsa.recursion.arrays.linearsearch;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,24};
        int target= 38;
        System.out.println(findTarget(arr,target,0));
    }

    private static boolean findTarget(int[] arr, int target, int i) {
        if(i==arr.length){
            return false;
        }
        return arr[i]==target || findTarget(arr,target,i+1);
    }
}
