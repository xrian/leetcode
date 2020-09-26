/**
 * https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof/
 * 剑指 Offer 09. 用两个栈实现队列
 * 双栈实现
 * @author iocntop@gmail.com
 */

package com.sukdao.leetcode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class CQueue {

    // 题解1,  401 ms	47.4 MB
//    Stack<Integer> a = new Stack<>();
//    Stack<Integer> b = new Stack<>();
//
//    public CQueue() {
//
//    }
//
//    public void appendTail(int value) {
//        a.push(value);
//    }
//
//    public int deleteHead() {
//        if (a.empty() && b.empty()){
//            return -1;
//        }
//        if (b.empty()){
//            while (!a.empty()){
//                b.push(a.pop());
//            }
//        }else {
//            return b.pop();
//        }
//
//
//        return b.empty() ? -1 : b.pop();
//    }

    // 题解2  66 ms	47 MB
//    Stack<Integer> a = new Stack<>();
//    Stack<Integer> b = new Stack<>();
//
//    public CQueue() {
//
//    }
//
//    public void appendTail(int value) {
//        a.push(value);
//    }
//
//    public int deleteHead() {
//        if (a.empty() && b.empty()){
//            return -1;
//        }
//        if (b.empty()){
//            while (!a.empty()){
//                b.push(a.pop());
//            }
//        }else {
//            return b.pop();
//        }
//
//
//        return b.empty() ? -1 : b.pop();
//    }

    // 题解3   56 ms	47.9 MB   使用 Deque 替换 stack
    Deque<Integer> a = new LinkedList<>();
    Deque<Integer> b = new LinkedList<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        a.push(value);
    }

    public int deleteHead() {
        if (a.isEmpty() && b.isEmpty()) {
            return -1;
        }
        if (b.isEmpty()) {
            while (!a.isEmpty()) {
                b.push(a.pop());
            }
        }
        return b.pop();
    }

}
