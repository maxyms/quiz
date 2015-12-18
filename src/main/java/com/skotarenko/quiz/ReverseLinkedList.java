package com.skotarenko.quiz;

/**
 * Reverse a singly linked list.
 * 
 * @author maxyms
 *
 */
public class ReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }
        ListNode p1 = head, p2 = head.next, tmp = p2.next;
        p1.next = null;
        while (tmp != null) {
            p2.next = p1;
            p1 = p2;
            p2 = tmp;
            tmp = p2.next;
        }
        p2.next = p1;
        return p2;
    }
}
