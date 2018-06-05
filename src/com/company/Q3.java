package com.company;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Q3 {
    // Longest substring without repeating characters
    public static int lengthOfLongestSubstring(String s) {
        int len = s.length();
        Character curChar = 'a';
        int maxLen = 0;
        int j = 0;
        if (len<2) return len;
        Map<Character, Integer> cur_word = new HashMap<Character, Integer>();
        for (int i = 0; i < len; i++) {
            curChar = s.charAt(i);
            if (cur_word.containsKey(curChar)){
                j = Math.max(j, cur_word.get(curChar)+1);
            }
            cur_word.put(curChar,i);
            maxLen = Math.max(maxLen, i-j+1);
        }
        return maxLen;
    }
}
