package BackTracking.Medium;

import java.util.ArrayList;
import java.util.Collections;

// Combination Sum
// https://www.geeksforgeeks.org/problems/combination-sum-1587115620/1
// Oct 31, 2023

public class CombinationSum {
    // Function to return a list of indexes denoting the required
    // combinations whose sum is equal to given number.
    static ArrayList<ArrayList<Integer>> combinationSum(ArrayList<Integer> A, int B) {
        Collections.sort(A);
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        f(A, ans, new ArrayList<>(), B, 0);

        return ans;
    }

    static void f(ArrayList<Integer> A, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> l, int tar, int idx) {
        if (tar <= 0) {
            if (tar == 0) {
                ans.add(new ArrayList<>(l));
            }

            return;
        }

        for (int i = idx; i < A.size(); i++) {
            int num = A.get(i);
            if (i > 0 && num == A.get(i - 1)) {
                continue;
            }
            if (num <= tar) {
                l.add(num);
                f(A, ans, l, tar - num, i);
                l.remove(l.size() - 1);
            } else {
                break;
            }
        }
    }
}