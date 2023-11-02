package Arrays.Easy;

// Minimum distance between two numbers
// https://www.geeksforgeeks.org/problems/minimum-distance-between-two-numbers/1
// Nov 02, 2023

public class MinimumDistanceBetweenTwoNumbers {
    int minDist(int arr[], int n, int x, int y) {
        int i = 0, prev = -1, minD = (int) 1e6;
        for (i = 0; i < n; i++) {
            if (arr[i] == x || arr[i] == y) {
                if (prev != -1 && arr[i] != arr[prev])
                    minD = Math.min(minD, i - prev);
                prev = i;
            }
        }

        if (minD == (int) 1e6)
            return -1;
        return minD;
    }
}