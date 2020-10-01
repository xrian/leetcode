/**
 * https://leetcode-cn.com/problems/best-time-to-buy-and-sell-stock/
 * 121. 买卖股票的最佳时机
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

public class BestTimeToBuyAndSellStock {

    // 题解1   1 ms	38.8 MB
    // 滑动窗口,如果快指针的值比慢指针的值小,则将快指针赋值给慢指针
    public int maxProfit(int[] prices) {
        if (prices == null || prices.length < 2) {
            return 0;
        }
        int max = 0;
        int slow = 0;
        int fast = 1;
        while (fast<prices.length){
            int sub = prices[fast]-prices[slow];
            if (sub>max){
                max = sub;
            }else if (prices[fast]<prices[slow]){
                slow = fast;
            }
            fast+=1;
        }
        return max;
    }

}
