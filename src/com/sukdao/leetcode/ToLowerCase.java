/**
 * https://leetcode-cn.com/problems/to-lower-case/
 * 实现函数 ToLowerCase()，该函数接收一个字符串参数 str，并将该字符串中的大写字母转换成小写字母，之后返回新的字符串。
 */
package com.sukdao.leetcode;

public class ToLowerCase {

    // 题解1          	0 ms	36 MB
    public String toLowerCase(String str) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < str.length(); i += 1) {
            int num = str.codePointAt(i);
            sb.append((char) (num >= 65 && num <= 90 ? num + 32 : num));
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String str = "sdafsafYUHKHGYTERHCGV";
        ToLowerCase to = new ToLowerCase();
        String str2 = to.toLowerCase(str);
        System.out.println(str2);
        System.out.println(str.toLowerCase().equals(str2));
    }

}
