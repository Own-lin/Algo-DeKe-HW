package com.ader1y.lcquestion.hw;

import org.springframework.util.Assert;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 最长的指定瑕疵度的元音字串
 */
public class FindMaxLengthFlaw {

    private static final Set<String> FILTER = new HashSet<>(Arrays.asList("a","e","i","o","u", "A", "E", "I", "O", "U"));


    public int flaw(int maxFlaw, String str){
        int maxLength = 0;
        int res = 0;
        int flawNum = 0;
        int preIndex = 0;

        for (int i = 0; i < str.length(); i++){
            //  瑕疵
            if (!FILTER.contains(String.valueOf(str.charAt(i)))){
                if (++flawNum > maxFlaw){
                    preIndex = findNextFlaw(str, preIndex, i);
                    --flawNum;
                }else {
                    maxLength = Math.max(maxLength, i - preIndex);
                }
            }else {
                maxLength = Math.max(maxLength, i - preIndex);
            }
            if (flawNum == maxFlaw){
                res = maxLength;
            }

        }

        return res;
    }

    private int findNextFlaw(String str, int start, int end){
        for (int i = start + 1; i <= end; i++){
            if (!FILTER.contains(String.valueOf(str.charAt(i)))) return i;
        }

        return end;
    }

}
