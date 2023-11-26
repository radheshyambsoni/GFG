package Recursion.Easy;

import java.util.ArrayList;
import java.util.List;

// Print Pattern
// https://www.geeksforgeeks.org/problems/print-pattern3549/1
// Nov 26, 2023

public class PrintPattern {
    void dec(List<Integer> l, int N, int n) {
        if (n <= 0) {
            l.add(n);
            inc(l, N, n + 5);
            return;
        }
        l.add(n);
        dec(l, N, n - 5);
    }

    void inc(List<Integer> l, int N, int n) {
        if (n == N) {
            l.add(N);
            return;
        }
        l.add(n);
        inc(l, N, n + 5);
    }

    public List<Integer> pattern(int N) {
        List<Integer> l = new ArrayList<>();
        if (N <= 0) {
            l.add(N);
            return l;
        }

        dec(l, N, N);

        return l;
    }
}