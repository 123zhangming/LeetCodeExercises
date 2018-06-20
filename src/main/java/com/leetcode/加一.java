package com.leetcode;

import java.math.BigInteger;
import java.util.Arrays;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/19
 */
public class 加一 {
    public static void main(String[] args) {
        int[] nums = {7,2,8,5,0,9,1,2,9,5,3,6,6,7,3,2,8,4,3,7,9,5,7,7,4,7,4,9,4,7,0,1,1,1,7,4,0,0,6};
        int[] ints = plusOne(nums);
        for (int i = 0; i < ints.length; i++) {
            int num = ints[i];
            System.out.println(num);
        }
    }

    public static int[] plusOne(int[] digits) {
        return new int[2];
    }
}
