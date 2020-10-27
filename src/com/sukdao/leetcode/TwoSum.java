/**
 * https://leetcode-cn.com/problems/two-sum/
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 */
package com.sukdao.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    // 解法1             	2 ms	38.4 MB
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<nums.length;i+=1){
            int n = nums[i];
            if (map.containsKey(n)){
                return new int[]{map.get(n), i};
            }else {
                map.put(target- n, i);
            }
        }
        return null;
    }

}
