package com.ader1y.lcquestion.hw;


/**
 * 消消乐
 */
public class EliminateStr {

    public String eliminate(String str){
        if (str == null || str.length() < 2) return str;

        int pre = 0;
        char[] arr = str.toCharArray();
        for (int i = 1; i < str.length(); i++){
            if (arr[i] == arr[pre]){
                arr[i] = '0';
                arr[pre] = '0';
                pre = findPre(arr, pre);
            }else {
                pre = i;

            }
        }

        StringBuilder sb = new StringBuilder();
        for (char c : arr){
            if (c != '0') sb.append(c);
        }

        return sb.toString();
    }

    private int findPre(char[] arr, int start){
        for (int c = start - 1; c >= 0; c--){
            if (arr[c] != '0') return c;
        }

        return 0;
    }

}
