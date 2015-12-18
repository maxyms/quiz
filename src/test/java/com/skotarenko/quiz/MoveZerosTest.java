package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class MoveZerosTest {
    @Test
    public void test1() {
        int[] nums = new int[] { 0, 1, 0, 3, 12 };
        new MoveZeros().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] { 1, 3, 12, 0, 0 }, nums);
    }

    @Test
    public void test2() {
        int[] nums = new int[] { 0, 0, 0, 3, 12 };
        new MoveZeros().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] { 3, 12, 0, 0, 0 }, nums);
    }

    @Test
    public void test3() {
        int[] nums = new int[] { 1, 4, 6, 3, 12 };
        new MoveZeros().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] { 1, 4, 6, 3, 12 }, nums);
    }

    @Test
    public void test4() {
        int[] nums = new int[] { 0, 0, 0, 0, 0 };
        new MoveZeros().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] { 0, 0, 0, 0, 0 }, nums);
    }

    @Test
    public void test5() {
        int[] nums = new int[] { 3, 12, 0, 0, 0 };
        new MoveZeros().moveZeroes(nums);
        Assert.assertArrayEquals(new int[] { 3, 12, 0, 0, 0 }, nums);
    }
}