package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class ReverseLinkedListTest {
    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        ListNode e = head;
        e.next = new ListNode(2);
        e = e.next;
        e.next = new ListNode(6);
        e = e.next;
        e.next = new ListNode(3);
        e = e.next;
        e.next = new ListNode(4);
        e = e.next;
        e.next = new ListNode(5);
        e = e.next;
        e.next = new ListNode(6);
        e = e.next;
        head = new ReverseLinkedList().reverseList(head);
        Assert.assertEquals("6->5->4->3->6->2->1", head.toString());
    }

    @Test
    public void testNull() {
        ListNode head = null;
        head = new ReverseLinkedList().reverseList(head);
        Assert.assertNull("Test null", head);
    }

    @Test
    public void test3() {
        ListNode head = new ListNode(1);
        ListNode e = head;
        e.next = new ListNode(2);
        e = e.next;
        e.next = new ListNode(6);
        e = e.next;
        head = new ReverseLinkedList().reverseList(head);
        Assert.assertEquals("6->2->1", head.toString());
    }

    @Test
    public void test4() {
        ListNode head = new ListNode(1);
        head = new ReverseLinkedList().reverseList(head);
        Assert.assertEquals("1", head.toString());
    }
}
