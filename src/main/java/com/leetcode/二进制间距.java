package com.leetcode;

/**
 * @Author: Merz
 * @Date: 2018/7/15 0015 上午 9:32
 */
public class 二进制间距 {


    public static void main(String[] args) {
        System.out.println(binaryGap(22));
    }
    public static int binaryGap(int N) {
        int len = 0;
        String s = Integer.toBinaryString(N);
        int index = s.indexOf("1");
        int index2 = index;
        while (true) {
            index2 = s.indexOf("1", index2 + 1);
            if (index2 != -1) {
                if (index2 - index > len) {
                    len = index2- index;
                }
                index = index2;
            } else {
                break;
            }
        }
        return len;
    }
}
