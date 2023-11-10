package Arrays.Medium;

import java.util.HashMap;

// Majority Element
// https://practice.geeksforgeeks.org/problems/majority-element-1587115620/1
// Nov 10, 2023

public class MajorityElement {
    static int majorityElement(int a[], int size) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i : a) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }

        for (int i : map.keySet()) {
            if (map.get(i) > size / 2) {
                return i;
            }
        }

        return -1;
    }
}