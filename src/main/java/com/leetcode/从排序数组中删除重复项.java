package com.leetcode;

/**
 * @Author: Merz
 * @Date: 2018/6/10 0010 下午 7:32
 *
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。

不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 *
 */
public class 从排序数组中删除重复项 {
    public static void main(String[] args) {
        int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
        System.out.println(removeDuplicates(nums));
    }

    public static int removeDuplicates(int[] nums) {
        int length = nums.length;
        int len = 0;
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            if (i+1<length) {
                int num1 = nums[i+1];
                if (num != num1) {
                    nums[len] = num;
                    len++;
                }
            } else {
                nums[len] = num;
                len++;
                break;
            }
        }
        return len;
    }
}
