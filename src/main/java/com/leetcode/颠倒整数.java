package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/20
 */
public class 颠倒整数 {
    public static void main(String[] args) {
        System.out.println(reverse(-1001010));
    }

    public static int reverse(int x) {
        try {
            boolean is = false;
            if (x < 0) {
                x = -x;
                is = true;
            }
            Integer integer = Integer.valueOf(new StringBuilder(String.valueOf(x)).reverse().toString());
            return is ? -integer : integer;
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
