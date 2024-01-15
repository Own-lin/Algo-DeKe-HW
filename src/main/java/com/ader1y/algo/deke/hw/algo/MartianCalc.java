package com.ader1y.lcquestion.hw;

/**
 * 火星文计算
 */
public class MartianCalc {

    private static final String SHARP = "#";

    private static final String DOLLAR = "$";

    public Integer calc(String str) {
        String[] slot = str.split(SHARP);
        Integer pre = null;
        for (String s : slot) {
            Integer temp = null;
            if (s.contains(DOLLAR)) {
                String[] dollarSlot = s.split("\\$");
                temp = calcDollar(dollarSlot);
            } else {
                temp = Integer.valueOf(s);
            }

            if (pre != null) pre = calcSharp(pre, temp);
            else pre = temp;


        }
        return pre;
    }

    private int calcSharp(int x, int y) {
        return 2 * x + 3 * y + 4;
    }

    private int calcDollar(String[] arr) {
        int x = Integer.parseInt(arr[0]);
        int y = Integer.parseInt(arr[1]);

        return 3 * x + y + 2;
    }

    public static void main(String[] args) {
        MartianCalc algo = new MartianCalc();
        System.out.println(algo.calc("7#6$5#12"));
    }

}
