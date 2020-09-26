/**
 * https://leetcode-cn.com/problems/delete-node-in-a-linked-list/
 * 237. 删除链表中的节点
 * 给定链表中的某个元素,需要将这个元素删除.
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode;

import com.sukdao.leetcode.entity.ListNode;

public class DeleteNode {

    // 题解1 	0 ms	38.4 MB
    // 将下一个节点的值赋值给当前节点,不断循环,然后丢弃最后个元素
//    public void deleteNode(ListNode node) {
//        ListNode n = node;
//        while (n != null && n.next!=null) {
//            // 将下一个的值赋值给当前元素
//            n.val = n.next.val;
//            if (n.next.next==null){
//                n.next=null;
//            }
//            // 将下一个的值赋值给当前元素
//            n = n.next;
//        }
//    }

    // 题解2    0 ms	38.2 MB
    // 只需要将下个节点的值赋值给当前节点.然后再删除下一个节点即可
    public void deleteNode(ListNode node) {
        if (node==null || node.next==null){
            return;
        }
        node.val = node.next.val;
        node.next = node.next.next;
    }

}
