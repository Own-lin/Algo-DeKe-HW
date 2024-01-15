package com.ader1y.lcquestion.hw;

import org.slf4j.Logger;

import java.util.*;

import static org.slf4j.LoggerFactory.getLogger;

/**
 * 寻找身高相近的小朋友
 */
public class SearchCloselyFriendly {

    public String searchClosestFriend(int height, int[] arr) {
        StringBuilder res = new StringBuilder();
        Arrays.sort(arr);
        TreeMap<Integer, List<Integer>> tm = new TreeMap<>();
        for (int a : arr) {
            int abs = Math.abs(height - a);
            List<Integer> slot = tm.get(abs);
            if (slot == null) slot = new ArrayList<>();
            slot.add(a);
            tm.put(abs, slot);
        }

        for (Map.Entry<Integer, List<Integer>> entry : tm.entrySet()){
            for (Integer l : entry.getValue()){
                res.append(l).append(" ");
            }

        }


        return res.toString();
    }

    public static void main(String[] args) {
        SearchCloselyFriendly algorithm = new SearchCloselyFriendly();
        System.out.println(algorithm.searchClosestFriend(100, new int[]{92, 93, 94, 95, 96, 99, 98, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 1}));
    }


}
