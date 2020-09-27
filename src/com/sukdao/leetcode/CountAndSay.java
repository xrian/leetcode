/**
 * https://leetcode-cn.com/problems/count-and-say/
 * 38. 外观数列
 * 动态规划,使用数组保存每次计算结果,从n=1开始步增计算.
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

public class CountAndSay {


    // 	题解1  1 ms	36.1 MB
    
    String[] list;

    private String loop(int n) {
        if (list[n - 1] == null) {
            StringBuffer str = new StringBuffer();
            if (n == 1) {
                str.append("1");
            } else {
                String prev = loop(n - 1);
                int slow = 0;
                char c = prev.charAt(0);
                char current;
                // 循环每个字符串下标

                for (int i = 1; i < prev.length(); i++) {
                    current = prev.charAt(i);
                    if (c != current) {
                        str.append(i - slow).append(c);
                        slow = i;
                        c = current;
                    }
                }
                str.append(prev.length() - slow).append(c);
            }
            list[n - 1] = str.toString();
            return str.toString();
        }
        return list[n - 1];
    }

    public String countAndSay(int n) {
        list = new String[n];
        return loop(n);
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        System.out.println(countAndSay.countAndSay(5));
    }

}
