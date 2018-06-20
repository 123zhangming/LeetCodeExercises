package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/20
 */
public class 字符串转整数 {

    public static void main(String[] args) {
        System.out.println(myAtoi("+111"));
    }

    public static int myAtoi(String str) {
        str = str.toLowerCase();
        str = str.replaceAll(" ", "");
        if (str.length()==0) {
            return 0;
        }
        String substring = "";
        if (str.substring(0, 1).equals("-")) {
            substring = "-";
        } else if (str.substring(0, 1).equals("+")) {
            substring = "+";
        }

        int index = str.length();
        int minIndex = 1;
        if (substring.equals("")) {
            minIndex = 0;
        }
        for (int i = index-1; i >= minIndex; i--) {
            int c = str.charAt(i);
            if (!(c>=48 && c<=57)) {
                index = i < index ? i : index;
            }
        }

        if (index == 0 || (substring.equals("-") && index == 1) || (substring.equals("+") && index == 1)) {
            return 0;
        }
        str = str.substring(0, index);
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            return str.contains("-") ? Integer.MIN_VALUE : Integer.MAX_VALUE;
        }
    }
}
