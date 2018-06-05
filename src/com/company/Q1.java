package com.company;
import java.util.*;
public class Q1 {
    public static int[] twoSum(int[] nums, int target) {
        int [] result = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        int diff = 0;
        for (int i=0; i<nums.length; i++) {
            diff = target-nums[i];
            if (map.containsKey(diff)) {
                result[1] = i;
                result[0] = map.get(diff);
                return result;
            }
            map.put(nums[i], i);
        }
        return result;
    }
}