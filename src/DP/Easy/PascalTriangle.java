package DP.Easy;

import java.util.ArrayList;

// Pascal Triangle
// https://www.geeksforgeeks.org/problems/pascal-triangle0652/1
// Nov 24, 2023

public class PascalTriangle {
    ArrayList<Long> nthRowOfPascalTriangle(int n) {
        ArrayList<ArrayList<Long>> ans = new ArrayList<>();
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < n; i++) {
            ArrayList<Long> ls = new ArrayList<>();
            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i)
                    ls.add((long) 1);
                else
                    ls.add((ans.get(i - 1).get(j) + ans.get(i - 1).get(j - 1)) % mod);
            }
            ans.add(ls);
        }
        return ans.get(n - 1);
    }
}