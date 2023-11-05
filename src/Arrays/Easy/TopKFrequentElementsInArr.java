package Arrays.Easy;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

// Top K Frequent Elements in Array
// https://www.geeksforgeeks.org/problems/top-k-frequent-elements-in-array/1
// Nov 05, 2023

public class TopKFrequentElementsInArr {
    public int[] topK(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> {
            if (a[1] == b[1]) {
                return b[0] - a[0];
            }

            return b[1] - a[1];
        });
        for (int key : map.keySet()) {
            pq.add(new int[] { key, map.get(key) });
        }

        int[] kFreq = new int[k];
        for (int i = 0; i < k; i++) {
            kFreq[i] = pq.poll()[0];
        }

        return kFreq;
    }
}