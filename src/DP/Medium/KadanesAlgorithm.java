package DP.Medium;

// Kadane's Algorithm
// https://practice.geeksforgeeks.org/problems/kadanes-algorithm-1587115620/1
// Nov 16, 2023

public class KadanesAlgorithm {
    long maxSubarraySum(int arr[], int n) {
        long maxSoFar = Integer.MIN_VALUE, maxEndingHere = 0;

        for (int i = 0; i < n; i++) {
            maxEndingHere += arr[i];

            if (maxSoFar < maxEndingHere) {
                maxSoFar = maxEndingHere;
            }

            if (maxEndingHere < 0) {
                maxEndingHere = 0;
            }
        }

        return maxSoFar;
    }

}