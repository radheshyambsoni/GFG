package Strings.Easy;

import java.util.HashMap;

// Isomorphic Strings
// https://www.geeksforgeeks.org/problems/isomorphic-strings-1587115620/1
// Nov 11, 2023

public class IsomorphicStrings {
    // Function to check if two strings are isomorphic.
    public static boolean areIsomorphic(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                char c = map.get(s.charAt(i));
                if (c != t.charAt(i))
                    return false;
            } else if (!map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            } else {
                return false;
            }
        }
        return true;
    }
}