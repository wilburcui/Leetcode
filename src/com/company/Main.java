package com.company;
public class Main {

    public static void main(String[] args) {
        /* Q1 - two sum
            Given an array of integers, return indices of the two numbers such that they add up to a specific target.
            You may assume that each input would have exactly one solution, and you may not use the same element twice.

            Example:
            Given nums = [2, 7, 11, 15], target = 9,
            Because nums[0] + nums[1] = 2 + 7 = 9,
            return [0, 1].
        */
	    int [] actualQ1 = Q1.twoSum(new int[]{2,7,11,15}, 9);
	    int [] expectQ1 = new int[]{0,1};
	    System.out.println("Q1 2sum test is "+ (actualQ1[0]==expectQ1[0] && actualQ1[1]==expectQ1[1]));
        System.out.println("sdjnafknds".substring(2,2));

        /* Q3 - Longest substirng without repeating characters
            Given a string, find the length of the longest substring without repeating characters.
            Examples:
            Given "abcabcbb", the answer is "abc", which the length is 3.
            Given "bbbbb", the answer is "b", with the length of 1.
            Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
         */
        int actualQ3 = Q3.lengthOfLongestSubstring("bbabcabc");
        int expectQ3 = 3;
        System.out.println("Q3 - Longest substirng without repeating characters is " + (actualQ3==expectQ3));

    }
}
