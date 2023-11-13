package DP.Medium;

import java.util.Arrays;

// Shortest Common Supersequence
// https://www.geeksforgeeks.org/problems/shortest-common-supersequence0322/1
// Nov 13, 2023

public class ShortestCommonSupersequence {
    // Function to find length of shortest common supersequence of two strings.
    public static int shortestCommonSupersequence(String X, String Y, int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return m + n - f(X, Y, m - 1, n - 1, dp);
    }

    static int f(String s, String t, int i, int j, int[][] dp) {
        if (i < 0 || j < 0) {
            return 0;
        }

        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        if (s.charAt(i) == t.charAt(j)) {
            return dp[i][j] = 1 + f(s, t, i - 1, j - 1, dp);
        }

        return dp[i][j] = Math.max(f(s, t, i - 1, j, dp), f(s, t, i, j - 1, dp));
    }
}