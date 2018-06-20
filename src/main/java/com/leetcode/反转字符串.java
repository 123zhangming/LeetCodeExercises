package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/20
 */
public class 反转字符串 {

    public static void main(String[] args) {
        System.out.println(reverseString("hello"));
    }

    public static String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}
