package com.sreelucodes.dsa.arrays;

public class FindLargest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(findLargestElement(arr));
    }

    private static int findLargestElement(int[] arr) {
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
