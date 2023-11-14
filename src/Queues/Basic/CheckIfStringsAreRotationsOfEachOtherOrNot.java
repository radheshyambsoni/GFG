package Queues.Basic;

import java.util.LinkedList;
import java.util.Queue;

// Check if strings are rotations of each other or not
// https://www.geeksforgeeks.org/problems/check-if-strings-are-rotations-of-each-other-or-not-1587115620/1
// Nov 14, 2023

public class CheckIfStringsAreRotationsOfEachOtherOrNot {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < s.length(); i++) {
            q1.add(s.charAt(i));
        }

        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < t.length(); i++) {
            q2.add(t.charAt(i));
        }

        int k = t.length();
        while (k > 0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return true;
        }

        return false;
    }

}