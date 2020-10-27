/**
 * https://leetcode-cn.com/problems/length-of-last-word/
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。
 */
package com.sukdao.leetcode;

public class LengthOfLastWord {

    // 题解1       	0 ms	36.5 MB
    public int lengthOfLastWord(String s) {
        int fast = s.length() - 1;
        int slow = fast;
        for (; fast >= 0; fast -= 1) {
            int num = s.codePointAt(fast);
            if (num == 32) {
                if (slow==fast){
                    slow-=1;
                }else {
                   break;
                }
            }
        }
        return slow-fast;
    }

    public static void main(String[] args) {
        LengthOfLastWord length = new LengthOfLastWord();

        System.out.println(length.lengthOfLastWord("  asdass sdfa"));
        System.out.println(length.lengthOfLastWord("  asdass sdfa  "));
        System.out.println(length.lengthOfLastWord("     "));
    }

}
