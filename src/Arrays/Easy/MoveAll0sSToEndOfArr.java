package Arrays.Easy;

// Move all zeroes to end of array
// Oct 31, 2023

public class MoveAll0sSToEndOfArr {
    void pushZerosToEnd(int[] arr, int n) {
        if (arr.length == 1) {
            return;
        }
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
    }
}