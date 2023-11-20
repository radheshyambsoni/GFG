package Arrays.Easy;

import java.util.ArrayList;

// Find duplicates in an array
// https://practice.geeksforgeeks.org/problems/find-duplicates-in-an-array/1
// Nov 20, 2023

public class FindDuplicatesInAnArray {
    public static ArrayList<Integer> duplicates(int arr[], int n) {
        int[] freq = new int[n];
        for (int num : arr) {
            freq[num]++;
        }

        ArrayList<Integer> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (freq[i] > 1) {
                l.add(i);
            }
        }

        if (l.isEmpty()) {
            l.add(-1);
        }

        return l;
    }
}