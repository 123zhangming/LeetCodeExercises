package com.leetcode;

import java.util.Arrays;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/19
 */
public class 只出现一次的数字 {

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        int len2 = len-1;
        for (int i = 0; i < len; i++) {
            if ((i<len2) && (nums[i] == nums[i+1])) {
                i = i+1;
            } else {
                return nums[i];
            }
        }
        return 0;
    }
}
