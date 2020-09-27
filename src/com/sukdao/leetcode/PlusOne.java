/**
 * https://leetcode-cn.com/problems/plus-one/
 * 66. 加一
 * 给数组最后一项加1, 需要考虑的情况是,+1后进位的情况.因为返回时数组,并且数组长度是固定的,所以需要考虑数组的长度
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import java.util.Arrays;

public class PlusOne {

    // 题解1  0 ms	37.5 MB
//    public int[] plusOne(int[] digits) {
//        int i = 0;
//        // 从第一位开始,往后寻找,是否全是9
//        while (i < digits.length && digits[i] == 9) {
//            i += 1;
//        }
//        if (i == digits.length) {
//            // 数组中全部是9的情况,长度加1
//            int[] res = new int[i + 1];
//            int b = 1;
//            res[0] = 1;
//            while (b <= i) {
//                res[b] = 0;
//                b += 1;
//            }
//            return res;
//        }
//        // 数组中一部分是9的情况,因为数组长度不变,所以直接修改原数组
//        int b = digits.length - 1;
//        while (b >= i) {
//            int num = digits[b] + 1;
//            // 是否有当前十进制+1的情况
//            if (num >= 10) {
//                digits[b] = 0;
//                b -= 1;
//            } else {
//                digits[b] = num;
//                return digits;
//            }
//        }
//        return digits;
//    }

    // 题解2   0 ms	37.6 MB   优化代码结构后

    public int[] plusOne(int[] digits) {
        // 从最后一位开始加1
        int b = digits.length - 1;
        while (b >= 0) {
            int num = digits[b] + 1;
            // 是否有当前十进制+1的情况
            if (num >= 10) {
                digits[b] = 0;
                b -= 1;
            } else {
                digits[b] = num;
                return digits;
            }
        }
        // 数组中全部是9的情况,长度加1
        int[] res = new int[digits.length + 1];
        // 下面省略给其他元素赋值,因为 int 类型默认值为0
        res[0] = 1;
        return res;
    }

    public static void main(String[] args) {
        PlusOne plusOne = new PlusOne();

        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 0})));
        System.out.println(Arrays.toString(plusOne.plusOne(new int[]{9, 9, 9})));
    }

}
