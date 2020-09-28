/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * 二分查找
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import java.util.Arrays;

public class QueShiDeShuZiLcof {

    // 解答1          0 ms	39.5 MB
    // 二分查找

    public int exec(int[] nums, int start, int end) {
        int sub = end - start;
        if (sub == 0) {
            return nums[start] > start ? start : start + 1;
        } else if (sub == 1) {
            if (nums[start] != start) {
                return start;
            } else if (nums[end] != end) {
                return end;
            } else {
                return end + 1;
            }
        }
        int i = start + sub / 2 + (sub % 2 != 0 ? 1 : 0);
        return nums[i] == i ? exec(nums, i, end) : exec(nums, start, i);
    }

    public int missingNumber(int[] nums) {
        return exec(nums, 0, nums.length - 1);
    }

    public void test(int[] nums, int num) {
        System.out.println(num + "     " + Arrays.toString(nums));
        System.out.println(missingNumber(nums) == num);
    }

    public static void main(String[] args) {

        QueShiDeShuZiLcof q = new QueShiDeShuZiLcof();
        q.test(new int[]{0, 1}, 2);
        q.test(new int[]{1, 2}, 0);
        q.test(new int[]{0, 1, 3}, 2);
        q.test(new int[]{0, 2, 3}, 1);
        q.test(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}, 8);
    }
}
