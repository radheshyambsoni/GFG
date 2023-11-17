package DP.Medium;

// Longest Common Substring
// https://www.geeksforgeeks.org/problems/longest-common-substring1452/1
// Nov 17, 2023

public class LongestCommonSubstring {
    int longestCommonSubstr(String s, String t, int n, int m) {
        int[][] dp = new int[n + 1][m + 1];
        int max = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (s.charAt(i - 1) == t.charAt(j - 1)) {
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                    max = Math.max(max, dp[i][j]);
                } else {
                    dp[i][j] = 0;
                }
            }
        }

        return max;
    }
}