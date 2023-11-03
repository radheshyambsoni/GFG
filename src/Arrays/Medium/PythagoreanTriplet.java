package Arrays.Medium;

import java.util.HashSet;

// Pythagorean Triplet
// https://www.geeksforgeeks.org/problems/pythagorean-triplet3018/1
// Nov 03, 2023

public class PythagoreanTriplet {
    boolean checkTriplet(int[] arr, int n) {
        if (n < 3)
            return false;

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            arr[i] *= arr[i];
            set.add(arr[i]);
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (set.contains(arr[i] + arr[j]))
                    return true;
            }
        }

        return false;
    }
}