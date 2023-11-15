package DP.Hard;

import java.util.Arrays;

// Better String
// https://www.geeksforgeeks.org/problems/better-string/1
// Nov 15, 2023

public class BetterString {
    static int distinctSubseqCnt(String s) {
        int[] last = new int[256];
        Arrays.fill(last, -1);

        int n = s.length();
        int[] dp = new int[n + 1];

        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            dp[i] = 2 * dp[i - 1];

            if (last[(int) s.charAt(i - 1)] != -1)
                dp[i] = dp[i] - dp[last[(int) s.charAt(i - 1)]];

            last[(int) s.charAt(i - 1)] = (i - 1);
        }

        return dp[n];
    }

    public static String betterString(String s, String t) {
        int cnt1 = distinctSubseqCnt(s);
        int cnt2 = distinctSubseqCnt(t);

        if (cnt1 >= cnt2)
            return s;

        return t;
    }
}