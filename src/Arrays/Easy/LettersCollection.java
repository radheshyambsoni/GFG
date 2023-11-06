package Arrays.Easy;

import java.util.ArrayList;
import java.util.List;

// Letters Collection
// https://www.geeksforgeeks.org/problems/c-letters-collection4552/1
// Nov 06, 2023

public class LettersCollection {
    static int f(int[][] mat, int n, int m, int r, int c, int ch) {
        int val = 0;
        int start = Math.max(c - ch, 0);
        int end = Math.min(c + ch + 1, m);
        if (r > ch - 1) {
            for (int col = start; col < end; col++) {
                val += mat[r - ch][col];
            }
        }
        if (r < n - ch) {
            for (int col = start; col < end; col++) {
                val += mat[r + ch][col];
            }
        }

        start = Math.max(r - ch + 1, 0);
        end = Math.min(r + ch, n);
        if (c > ch - 1) {
            for (int row = start; row < end; row++) {
                val += mat[row][c - ch];
            }
        }
        if (c < m - ch) {
            for (int row = start; row < end; row++) {
                val += mat[row][c + ch];
            }
        }

        return val;
    }

    static List<Integer> matrixSum(int n, int m, int mat[][], int q, int queries[][]) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < q; i++) {
            int ch = queries[i][0], r = queries[i][1], c = queries[i][2];
            int val = 0;
            val += f(mat, n, m, r, c, ch);
            ans.add(val);
        }

        return ans;
    }
}