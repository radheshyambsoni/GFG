package Arrays.Easy;

// Predict the Column
// https://www.geeksforgeeks.org/problems/predict-the-column/1
// Nov 09, 2023

public class PredictTheColumn {
    int columnWithMaxZeros(int arr[][], int n) {
        int max = 0, idx = -1;
        for (int i = 0; i < n; i++) {
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j][i] == 0) {
                    cnt++;
                }
            }
            if (cnt > max) {
                max = cnt;
                idx = i;
            }
        }

        return idx;
    }
}