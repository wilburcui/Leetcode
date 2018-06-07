package com.company;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q846 {
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int x: hand) {
            if (map.containsKey(x)){
                int ocs = map.get(x);
                map.put(x,ocs);
            } else {
                map.put(x,1);
            }
        }

    }
    public boolean validateOneSeq(Map<Integer,Integer> map, int maxSize, int start){
        for (int i = start; i<start+maxSize; i++){

        }
    }
    public boolean isNStraightHand(int[] hand, int W) {
        if (hand.length % W != 0) return false;
        Arrays.sort(hand);
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();


    }
}
