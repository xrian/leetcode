/**
 * https://leetcode-cn.com/problems/reverse-words-in-a-string-iii/
 * 557. 反转字符串中的单词 III
 * <p>
 * ASCII 32为空格
 */
package com.sukdao.leetcode;

public class ReverseWordsInAStringIii {

    public String reverseWords(String s) {
        if (s==null || s.length()<2){
            return s;
        }
        StringBuffer sb = new StringBuffer();
        int start = -1;
        int end = 0;
        while (end <= s.length()) {
            // 32 为空格
            if (start != -1) {
                if (end == s.length() || s.codePointAt(end) == 32) {
                    for (int i = end - 1; i >= start; i -= 1) {
                        sb.append(s.charAt(i));
                    }
                    if (end == s.length()) {
                        break;
                    }
                    start = -1;
                    sb.append(" ");
                }
            }else if (start==-1 && s.codePointAt(end) != 32){
                start = end;
            }
            end += 1;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        ReverseWordsInAStringIii reverseWordsInAStringIii = new ReverseWordsInAStringIii();
        String str = reverseWordsInAStringIii.reverseWords("Let's take LeetCode contest");
        System.out.println(str);
        System.out.println("s'teL ekat edoCteeL tsetnoc".equals(str));
    }

}
