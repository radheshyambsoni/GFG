package Arrays.Medium;

// Sort an array of 0s, 1s and 2s
// https://practice.geeksforgeeks.org/problems/sort-an-array-of-0s-1s-and-2s4231/1
// Nov 01, 2023

public class SortAnArrOf0s1sAnd2s {
    public static void sort012(int a[], int n) {
        int low = 0, high = n - 1, mid = 0;
        while (mid <= high) {
            if (a[mid] == 0) {
                a[mid++] = a[low];
                a[low++] = 0;
            } else if (a[mid] == 1) {
                mid++;
            } else {
                a[mid] = a[high];
                a[high--] = 2;
            }
        }
    }
}