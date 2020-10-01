/**
 * https://leetcode-cn.com/problems/move-zeroes/
 * 283. 移动零
 */
package com.sukdao.leetcode;

public class MoveZeroes {

    // 题解1                0 ms	39.2 MB
//    public void moveZeroes(int[] nums) {
//        if (nums == null || nums.length < 2) {
//            return;
//        }
//        int slow = 0;
//        int fast = 0;
//        while (fast < nums.length) {
//            if (nums[fast] != 0) {
//                nums[slow] = nums[fast];
//                slow += 1;
//            }
//            fast += 1;
//        }
//        while (slow < nums.length) {
//            nums[slow] = 0;
//            slow += 1;
//        }
//    }

    // 题解2                  0 ms	39 MB
    // 只要快慢指针的下标不一致,则将快指针的值设置为0. 只需要循环一次
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length < 2) {
            return;
        }
        int slow = 0;
        int fast = 0;
        while (fast < nums.length) {
            if (nums[fast] != 0) {
                nums[slow] = nums[fast];
                if (fast != slow) {
                    nums[fast] = 0;
                }
                slow += 1;
            }
            fast += 1;
        }
    }

}
