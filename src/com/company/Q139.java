package com.company;

import java.util.List;

public class Q139 {
    public boolean wordBreak(String s, List<String> wordDict) {
        boolean [] dp = new boolean[wordDict.size()];
        dp[0] = true;
        for (int i = 1; i <= wordDict.size(); i++){
            for (int j = 0; j < i; j++) {
                if (dp[j] && wordDict.contains(s.substring(j, i))){
                    dp[i] = true;
                    break;
                }
            }
        }
        return dp[s.length()];
    }
}
