package com.leetcode;

/**
 * @author Merz
 * @Description:
 * @date 2018/6/20
 */
public class 验证回文字符串 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panamaa"));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int c = s.charAt(i);
            if ((c>=48 && c<=57) || (c>=97 && c<=122)) {
                sb.append((char)c);
            }
        }
        s = sb.toString();
        int len = sb.length()/2;
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) != s.charAt(s.length()-1-i)) {
                return false;
            }
        }
        return true;
    }
}
