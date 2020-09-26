/**
 * https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * 移除倒数第几个节点
 * 使用快慢指针,快指针先移动n步,然后再一直迭代,直到快指针到达末尾
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import com.sukdao.leetcode.entity.ListNode;
import com.sukdao.leetcode.util.ListNodeUtils;

public class RemoveNthFromEnd {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
        for (int i = 0; i < n; i += 1) {
            if (fast != null) {
                fast = fast.next;
            } else {
                return null;
            }
        }
        if (fast == null) {
            return head.next;
        }
        while (fast.next != null) {
            fast = fast.next;
            slow = slow.next;
        }
        slow.next = slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        ListNode listNode = ListNodeUtils.generatorOrderly();
        ListNodeUtils.print(listNode);
        RemoveNthFromEnd removeNthFromEnd = new RemoveNthFromEnd();
        listNode = removeNthFromEnd.removeNthFromEnd(listNode, 10);
        System.out.println("---------------------");
        ListNodeUtils.print(listNode);
    }

}
