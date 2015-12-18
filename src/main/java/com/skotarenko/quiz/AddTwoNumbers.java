package com.skotarenko.quiz;

/**
 * You are given two linked lists representing two non-negative numbers. 
 * The digits are stored in reverse order and each of their nodes contain a single digit. 
 * Add the two numbers and return it as a linked list.

    Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
    Output: 7 -> 0 -> 8

 * @author maxyms
 *
 */
public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null && l2 == null) {
            return null;
        }
        if (l1 == null && l2 != null) {
            return l2;
        }
        if (l1 != null && l2 == null) {
            return l1;
        }
        ListNode head = null;
        ListNode e = head;
        ListNode e1 = l1;
        ListNode e2 = l2;
        int nval = 0;
        while (e1 != null && e2 != null) {
            int val = e1.val + e2.val + nval;
            if (val >= 10) {
                nval = 1;
                val -= 10;
            } else {
                nval = 0;
            }
            if (head == null) {
                head = new ListNode(val);
                e = head;
            } else {
                e.next = new ListNode(val);
                e = e.next;
            }
            e1 = e1.next;
            e2 = e2.next;
        }
        ListNode tail = (e1 != null) ? e1 : null;
        tail = (e2 != null) ? e2 : tail;
        while (tail != null) {
            int val = tail.val + nval;
            if (val >= 10) {
                nval = 1;
                val -= 10;
            } else {
                nval = 0;
            }
            e.next = new ListNode(val);
            e = e.next;
            tail = tail.next;
        }
        if (nval > 0) {
            e.next = new ListNode(nval);
        }
        return head;
    }
}
