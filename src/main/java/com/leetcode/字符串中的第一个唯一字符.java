package com.leetcode;


/**
 * @author Merz
 * @Description:
 * @date 2018/6/20
 */
public class 字符串中的第一个唯一字符 {

    public static void main(String[] args) {
        System.out.println(firstUniqChar("dddccdbba"));
    }

    public static int firstUniqChar(String s) {
        String temp = s;
        while(true) {
            if (temp == null || "".equals(temp)) {
                return -1;
            }
            char c = temp.charAt(0);
            if (temp.indexOf(c) == temp.lastIndexOf(c)) {
                return s.indexOf(c);
            } else {
                temp = temp.replaceAll(String.valueOf(c), "");
            }
        }
    }
}
