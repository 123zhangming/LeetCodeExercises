package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/19
 */
public class 旋转图像 {
    public static void main(String[] args) {
        int[][] matrix ={{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        rotate(matrix);
    }


    public static void rotate(int[][] matrix) {
        int len = matrix.length/2;
        for (int i = 0; i < len; i++) {
            int[] temp = matrix[i];
            matrix[i] = matrix[matrix.length-1-i];
            matrix[matrix.length-1-i] = temp;
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j>i) {
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();

        }
    }
}
