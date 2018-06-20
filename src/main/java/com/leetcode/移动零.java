package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/19
 */
public class 移动零 {

    public static void main(String[] args) {
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
    }
    public static void moveZeroes(int[] nums) {
        int index = 0;
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int j = i+1;
            if (j>len-1) {
                break;
            }
            int num = nums[i];
            int num1 = nums[j];
            if (num == 0 && num1 != 0) {
                if (i != 0 && nums[i-1] == 0) {
                    int temp = num1;
                    nums[j] = nums[index];
                    nums[index] = temp;
                    index++;
                } else {
                    int temp = num;
                    nums[i] = num1;
                    nums[j] = temp;
                }
            } else {
                if (i>0 && nums[i-1] != 0) {
                    index = i;
                }
            }
        }

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }
    }
}
