package com.sreelucodes.dsa.arrays;

public class MaximumSubarray {
    // Result class to store the answer
    public static class Result {
        int maxSum;
        int startIndex;
        int endIndex;

        public Result(int maxSum, int startIndex, int endIndex) {
            this.maxSum = maxSum;
            this.startIndex = startIndex;
            this.endIndex = endIndex;
        }

        @Override
        public String toString() {
            return String.format("Max Sum: %d, Start Index: %d, End Index: %d",
                    maxSum, startIndex, endIndex);
        }
    }

    // Main algorithm - Kadane's Algorithm with indices
    public static Result findMaxSubarray(int[] arr) {
        // Handle edge cases
        if (arr == null || arr.length == 0) {
            return new Result(0, -1, -1);
        }

        // Initialize variables
        int maxSum = arr[0];        // Best sum found so far
        int currentSum = arr[0];    // Sum of current subarray

        int start = 0;              // Start index of best subarray
        int end = 0;                // End index of best subarray
        int tempStart = 0;          // Temporary start index

        // Process each element starting from index 1
        for (int i = 1; i < arr.length; i++) {
            // Decision: Start fresh or extend current subarray?
            if (currentSum < 0) {
                // Current sum is negative, start fresh from current element
                currentSum = arr[i];
                tempStart = i;
            } else {
                // Current sum is positive, extend the subarray
                currentSum += arr[i];
            }

            // Update maximum if we found a better sum
            if (currentSum > maxSum) {
                maxSum = currentSum;
                start = tempStart;  // Commit the temporary start
                end = i;
            }
        }

        return new Result(maxSum, start, end);
    }

    // Helper method to print array
    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Helper method to print subarray
    public static void printSubarray(int[] arr, int start, int end) {
        System.out.print("[");
        for (int i = start; i <= end; i++) {
            System.out.print(arr[i]);
            if (i < end) System.out.print(", ");
        }
        System.out.println("]");
    }

    // Main method with examples
    public static void main(String[] args) {

        // Example 1: Mixed positive and negative
        System.out.println("=== Example 1: Mixed Numbers ===");
        int[] arr1 = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        runExample(arr1);

        // Example 2: All negative
        System.out.println("\n=== Example 2: All Negative ===");
        int[] arr2 = {-5, -2, -8, -1, -4};
        runExample(arr2);

        // Example 3: All positive
        System.out.println("\n=== Example 3: All Positive ===");
        int[] arr3 = {1, 2, 3, 4, 5};
        runExample(arr3);

        // Example 4: Single element
        System.out.println("\n=== Example 4: Single Element ===");
        int[] arr4 = {-3};
        runExample(arr4);

        // Example 5: Two elements
        System.out.println("\n=== Example 5: Two Elements ===");
        int[] arr5 = {-2, 1};
        runExample(arr5);

        // Example 6: Complex case
        System.out.println("\n=== Example 6: Complex Case ===");
        int[] arr6 = {5, -3, 5, -10, 8, -2, 3};
        runExample(arr6);
    }

    public static void runExample(int[] arr) {
        System.out.print("Input Array: ");
        printArray(arr);

        Result result = findMaxSubarray(arr);

        System.out.println("Result: " + result);
        System.out.print("Subarray: ");
        printSubarray(arr, result.startIndex, result.endIndex);
    }

}
