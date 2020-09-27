/**
 * https://leetcode-cn.com/problems/linked-list-cycle/
 * 141. 环形链表
 * 快慢指针
 *
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import com.sukdao.leetcode.entity.ListNode;

public class LinkedListCycle {

    public boolean hasCycle(ListNode head) {
        if (head != null && head.next != null) {
            ListNode slow = head;
            ListNode fast = head.next.next;
            while (slow != null && fast != null && fast.next != null) {
                if (slow.val == fast.val) {
                    return true;
                } else {
                    slow = slow.next;
                    fast = fast.next.next;
                }
            }
        }
        return false;
    }
}
