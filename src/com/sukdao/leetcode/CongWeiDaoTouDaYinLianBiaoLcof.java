/**
 * https://leetcode-cn.com/problems/cong-wei-dao-tou-da-yin-lian-biao-lcof/
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
package com.sukdao.leetcode;

import com.sukdao.leetcode.entity.ListNode;
import com.sukdao.leetcode.util.ListNodeUtils;

import java.util.Arrays;

public class CongWeiDaoTouDaYinLianBiaoLcof {

    // 解答1      0 ms	39.1 MB
    public int[] reversePrint(ListNode head) {
        if (head == null) {
            return new int[0];
        } else if (head.next == null) {
            return new int[]{head.val};
        }
        ListNode prev = head;
        ListNode current = prev.next;
        prev.next = null;
        ListNode lin = null;
        int length = 2;
        while (current.next != null) {
            lin = current.next;
            current.next = prev;
            prev = current;
            current = lin;
            length += 1;
        }
        current.next = prev;

        int[] res = new int[length];
        length = 0;
        while (current.next != null) {
            res[length] = current.val;
            current = current.next;
            length +=1;
        }
        res[length] = current.val;
        return res;
    }

    public static void main(String[] args) {

        ListNode listNode = ListNodeUtils.generatorRepeatUnOrderly();
        CongWeiDaoTouDaYinLianBiaoLcof lcof = new CongWeiDaoTouDaYinLianBiaoLcof();
        ListNodeUtils.print(listNode);
        System.out.println("--------------------------");
        int[] arr = lcof.reversePrint(listNode);
        System.out.println("--------------------------");
        System.out.println(Arrays.toString(arr));

    }
}
