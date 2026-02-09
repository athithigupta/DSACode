package com.sreelucodes.dsa.recursion.arrays.linearsearch;

import java.util.ArrayList;

public class LinearSearchFindAllTarget {
    public static void main(String[] args) {
        int[] arr = {3,18,2,1,18,24};
        int target= 18;
        ArrayList<Integer> resultList = new ArrayList<>();
        System.out.println(findTarget(arr,target,0,resultList));
        System.out.println(findTargetWithoutResultListInParam(arr,target,0));
        System.out.println(findTargetListInsideMethodBody(arr,target,0));

    }

    private static ArrayList<Integer> findTarget(int[] arr, int target, int i, ArrayList<Integer> resultList) {
        if(i == arr.length){
            return resultList;
        }
        if(arr[i]==target){
            resultList.add(i);
        }
            return findTarget(arr,target,i+1,resultList);
    }

    static ArrayList<Integer> list = new ArrayList<>();
    private static ArrayList<Integer> findTargetWithoutResultListInParam(int[] arr, int target, int i) {
        if(i == arr.length){
            return list;
        }
        if(arr[i]==target){
            list.add(i);
        }
        return findTargetWithoutResultListInParam(arr,target,i+1);
    }

    private static ArrayList<Integer> findTargetListInsideMethodBody(int[] arr, int target, int i) {
        ArrayList<Integer> list2 = new ArrayList<>();
        if(i == arr.length){
            return list2;
        }

        if(arr[i]==target){
            list2.add(i);
        }
        ArrayList<Integer> resultList = findTargetListInsideMethodBody(arr,target,i+1);
        list2.addAll(resultList);
        return list2;
    }



}
