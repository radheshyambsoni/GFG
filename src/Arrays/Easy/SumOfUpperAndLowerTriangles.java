package Arrays.Easy;

import java.util.ArrayList;

// Sum of upper and lower triangles
// https://www.geeksforgeeks.org/problems/sum-of-upper-and-lower-triangles-1587115621/1
// Nov 07, 2023

public class SumOfUpperAndLowerTriangles {
    // Function to return sum of upper and lower triangles of a matrix.
    static ArrayList<Integer> sumTriangles(int matrix[][], int n) {
        int up = 0, low = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                up += matrix[i][j];
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                low += matrix[i][j];
            }
        }

        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(up);
        ans.add(low);

        return ans;
    }
}