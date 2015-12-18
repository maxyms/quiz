package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class AddTwoNumbersTest {
    @Test
    public void test1() {
        ListNode head1 = new ListNode(2);
        ListNode e = head1;
        e.next = new ListNode(4);
        e = e.next;
        e.next = new ListNode(3);
        ListNode head2 = new ListNode(5);
        e = head2;
        e.next = new ListNode(6);
        e = e.next;
        e.next = new ListNode(4);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("7->0->8", res.toString());
    }

    @Test
    public void test2() {
        ListNode head1 = new ListNode(1);
        ListNode e = head1;
        e.next = new ListNode(8);
        ListNode head2 = new ListNode(0);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("1->8", res.toString());
    }

    @Test
    public void test3() {
        ListNode head1 = new ListNode(6);
        ListNode e = head1;
        e.next = new ListNode(8);
        ListNode head2 = new ListNode(7);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("3->9", res.toString());
    }

    @Test
    public void test4() {
        ListNode head1 = new ListNode(7);
        ListNode head2 = new ListNode(6);
        ListNode e = head2;
        e.next = new ListNode(8);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("3->9", res.toString());
    }

    @Test
    public void test5() {
        ListNode head1 = new ListNode(2);
        ListNode e = head1;
        e.next = new ListNode(4);
        e = e.next;
        e.next = new ListNode(9);
        ListNode head2 = new ListNode(5);
        e = head2;
        e.next = new ListNode(6);
        e = e.next;
        e.next = new ListNode(4);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("7->0->4->1", res.toString());
    }

    @Test
    public void test6() {
        ListNode head1 = new ListNode(9);
        ListNode e = head1;
        e.next = new ListNode(1);
        e = e.next;
        e.next = new ListNode(6);
        ListNode head2 = new ListNode(0);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("9->1->6", res.toString());
    }

    @Test
    public void test7() {
        ListNode head1 = new ListNode(9);
        ListNode e = head1;
        e.next = new ListNode(1);
        e = e.next;
        e.next = new ListNode(6);
        e = e.next;
        e.next = new ListNode(5);
        ListNode head2 = new ListNode(1);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("0->2->6->5", res.toString());
    }

    @Test
    public void test8() {
        ListNode head1 = new ListNode(9);
        ListNode e = head1;
        e.next = new ListNode(1);
        e = e.next;
        e.next = new ListNode(6);
        e = e.next;
        e.next = new ListNode(5);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, null);
        Assert.assertEquals("9->1->6->5", res.toString());
    }

    @Test
    public void test9() {
        ListNode head1 = new ListNode(9);
        ListNode e = head1;
        e.next = new ListNode(9);
        e = e.next;
        e.next = new ListNode(9);
        e = e.next;
        e.next = new ListNode(9);
        e = e.next;
        e.next = new ListNode(9);
        e = e.next;
        e.next = new ListNode(9);
        ListNode head2 = new ListNode(1);
        ListNode res = new AddTwoNumbers().addTwoNumbers(head1, head2);
        Assert.assertEquals("0->0->0->0->0->0->1", res.toString());
    }
}