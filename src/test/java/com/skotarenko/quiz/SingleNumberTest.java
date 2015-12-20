package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class SingleNumberTest {
    @Test
    public void testName() throws Exception {
        Assert.assertEquals(3, new SingleNumber().singleNumber(new int[] { 1, 2, 3, 4, 1, 2, 4 }));
        Assert.assertEquals(4, new SingleNumber().singleNumber(new int[] { 1, 2, 3, 4, 1, 2, 3 }));
        Assert.assertEquals(4, new SingleNumber().singleNumber(new int[] { 4 }));
        Assert.assertEquals(2, new SingleNumber().singleNumber(new int[] { 4, 4, 2 }));
        Assert.assertEquals(-1, new SingleNumber().singleNumber(new int[] { 4, 4, 2, 2 }));
    }
}
