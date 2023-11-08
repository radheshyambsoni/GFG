package Arrays.Easy;

import java.util.ArrayList;

// Print Matrix in snake Pattern
// https://www.geeksforgeeks.org/problems/print-matrix-in-snake-pattern-1587115621/1
// Nov 08, 2023

public class PrintMatrixInSnakePattern {
    // Function to return list of integers visited in snake pattern in matrix.
    static ArrayList<Integer> snakePattern(int matrix[][]) {
        int n = matrix.length;
        boolean flag = true;
        int start = 0, end = n - 1, add = 1, row = 0;

        ArrayList<Integer> l = new ArrayList<>();
        while (row < n) {
            if (flag) {
                start = 0;
                end = n - 1;
                add = 1;
            } else {
                start = n - 1;
                end = 0;
                add = -1;
            }

            for (int i = start; flag ? i <= end : i >= end; i += add) {
                l.add(matrix[row][i]);
            }
            row++;
            flag = !flag;
        }

        return l;
    }
}