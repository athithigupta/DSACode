package com.sreelucodes.dsa.recursion.arrays.linearsearch;

public class LinearSearchIndexNo {
    public static void main(String[] args) {
        int[] arr = {3,2,1,18,24};
        int target= 18;
        System.out.println(findTarget(arr,target,0));
    }

    private static int findTarget(int[] arr, int target, int i) {
        if(i==arr.length){
            return -1;
        }
        return (arr[i]==target) ? i : findTarget(arr,target,i+1);
    }
}
