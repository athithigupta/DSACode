package com.sreelucodes.dsa.recursion.arrays.linearsearch;

public class LinearSearchFindLastIndex {
    public static void main(String[] args) {
        int[] arr = {3,18,2,1,18,24};
        int target= 18;
        System.out.println(findTarget(arr,target,arr.length-1));
    }

    private static int findTarget(int[] arr, int target, int i) {
        if(i == -1){
            return -1;
        }
        return (arr[i] == target) ? i : findTarget(arr,target,i-1);
    }
}
