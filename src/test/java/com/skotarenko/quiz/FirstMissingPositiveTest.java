package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class FirstMissingPositiveTest {
    @Test
    public void testName() throws Exception {
        Assert.assertEquals(3, new FirstMissingPositive().firstMissingPositive(new int[] { 1, 2, 0 }));
        Assert.assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[] { 3, 4, -1, 1 }));
        Assert.assertEquals(5, new FirstMissingPositive().firstMissingPositive(new int[] { -10, 9, 8, 2, 4, 1, 6, -2, 3 }));
        Assert.assertEquals(4, new FirstMissingPositive().firstMissingPositive(new int[] { -10, 1, 2, 1009, 108, 252, 554, 11, 26, -2, 3 }));
        Assert.assertEquals(1, new FirstMissingPositive().firstMissingPositive(new int[] { 0 }));
        Assert.assertEquals(2, new FirstMissingPositive().firstMissingPositive(new int[] { 1, 1 }));
    }
}
