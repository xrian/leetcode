/**
 * https://leetcode-cn.com/problems/qiu-12n-lcof/
 * 剑指 Offer 64. 求1+2+…+n
 * 递归计算
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

public class Qiu12nLcof {

    // 题解1 0 ms	36.4 MB

//    public int sumNums(int n) {
//        return n == 1 ? 1 : n + sumNums(n - 1);
//    }

    // 题解2   1 ms	36.4 MB
    // 不使用三目运算判断
    public int sumNums(int n) {
        boolean f = n > 1 && (n += sumNums(n - 1)) > 0;
        return n;
    }

    public static void main(String[] args) {
        Qiu12nLcof sumNums = new Qiu12nLcof();
        System.out.println(sumNums.sumNums(3));
        System.out.println(sumNums.sumNums(9));
    }

}
