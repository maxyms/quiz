package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class DeleteNodeInLinkedListTest {
    @Test
    public void testNull() {
        ListNode head = null;
        new DeleteNodeInLinkedList().deleteNode(head);
    }

    @Test
    public void test1() {
        ListNode head = new ListNode(1);
        ListNode e = head;
        e.next = new ListNode(2);
        e = e.next;
        ListNode toDelete = new ListNode(3);
        e.next = toDelete;
        e = e.next;
        e.next = new ListNode(4);
        e = e.next;
        new DeleteNodeInLinkedList().deleteNode(toDelete);
        Assert.assertEquals("1->2->4", head.toString());
    }

    @Test
    public void test2() {
        ListNode head = new ListNode(1);
        ListNode e = head;
        e.next = new ListNode(2);
        e = e.next;
        e.next = new ListNode(3);
        e = e.next;
        ListNode toDelete = new ListNode(4);
        e.next = toDelete;
        e = e.next;
        new DeleteNodeInLinkedList().deleteNode(toDelete);
        Assert.assertEquals("1->2->3->4", head.toString());
    }
}
