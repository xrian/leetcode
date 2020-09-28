/**
 * https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof/
 * 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * 二分查找
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

public class QueShiDeShuZiLcof {

    public int exec(int[] nums, int start, int end) {
        int sub = end - start;
        if (sub == 0) {
            return nums[start] > start ? start : start + 1;
        }
        int i = start + sub / 2 + (sub % 2 != 0 ? 1 : 0);
        return nums[i] > i ? exec(nums, i, end) : exec(nums, start, i);
    }

    public int missingNumber(int[] nums) {
        if (nums.length == 2) {
            if (nums[0] != 0) {
                return 0;
            } else if (nums[1] != 1) {
                return 1;
            } else {
                return 2;
            }
        }
        return exec(nums, 0, nums.length - 1);
    }

    public static void main(String[] args) {
//        int[] nums = {0, 1};
//        int[] nums = {1, 2};
//        int[] nums = {1, 2};
//        int[] nums = {0, 1, 3};
        int[] nums = {0, 2, 3};

        QueShiDeShuZiLcof q = new QueShiDeShuZiLcof();

        System.out.println(q.missingNumber(nums));
    }
}
