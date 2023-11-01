package Arrays.Easy;

// Frequencies of Limited Range Array Elements
// https://www.geeksforgeeks.org/problems/frequency-of-array-elements-1587115620/1
// Nov 01, 2023

public class FreqfLimitedRangeArrElements {
    // Function to count the frequency of all elements from 1 to N in the array.
    public static void frequencyCount(int arr[], int N, int P) {
        int[] freq = new int[N];
        for (int num : arr) {
            if (num > N) {
                continue;
            }
            freq[num - 1]++;
        }

        for (int i = 0; i < arr.length; i++) {

            arr[i] = freq[i];
        }
    }
}