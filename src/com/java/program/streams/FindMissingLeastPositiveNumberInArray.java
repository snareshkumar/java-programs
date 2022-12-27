package com.java.program.streams;

import java.util.Arrays;

public class FindMissingLeastPositiveNumberInArray {

    /**
     * Requirement - Given array of N integer elements. In the given array find the
     * minimum missing element in the array(positive number)
     * 
     */

    public static void main(String[] args) {

        int arr[] = { 1, 8, 4, 7, 2, 3, 10, -12, 11 };

        int number = findMissingMinPositiveNumber(arr);

        System.out.println("number value is " + number);
    }

    private static int findMissingMinPositiveNumber(int[] arr) {

        int ans = 1;

        // Sort the array in ascending order
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ans)
                ans++;
        }

        return ans;
    }

}
