/**
 * @author iocntop@gmail.com
 */
package com.sukdao.leetcode.util;

import com.sukdao.leetcode.entity.ListNode;

public class ListNodeUtils {

    /**
     * 将数组转换为链表
     *
     * @param arr
     * @return
     */
    public static ListNode arrayToListNode(Integer[] arr) {
        ListNode node = new ListNode(-1);
        ListNode next = node;
        for (int i : arr) {
            ListNode c = new ListNode(i);
            next.next = c;
            next = c;
        }
        return node.next;
    }

    /**
     * 输出链表
     *
     * @param head
     */
    public static void print(ListNode head) {
        ListNode node = head;
        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

    /**
     * 返回一个重复的,已排序的链表
     *
     * @return
     */
    public static ListNode generatorRepeatOrderly() {
        Integer[] integers = {1, 1, 1, 1, 2, 2, 3, 3, 4, 4, 4, 5, 5, 5, 6, 7, 7, 7, 8, 9, 9, 9, 9, 10, 11};
        return arrayToListNode(integers);
    }

    /**
     * 返回一个重复的, 无序的链表
     *
     * @return
     */
    public static ListNode generatorRepeatUnOrderly() {
        Integer[] integers = {1, 3, 4, 1, 1, 2, 5, 7, 8, 9, 1, 3, 9, 2, 5, 6, 7, 7, 4, 4, 5, 9, 9, 10, 11};
        return arrayToListNode(integers);
    }

    /**
     * 返回一个有序,无重复的链表
     *
     * @return
     */
    public static ListNode generatorOrderly() {
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        return arrayToListNode(integers);
    }

    /**
     * 返回一个无序的,无重复的链表
     *
     * @return
     */
    public static ListNode generatorUnOrderly() {
        Integer[] integers = {1, 5, 9, 7, 3, 0, 9, 10, 8, 2};
        return arrayToListNode(integers);
    }

}
