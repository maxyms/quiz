package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumberTest {
    @Test
    public void testName() throws Exception {
        Assert.assertEquals(2, new MissingNumber().missingNumber(new int[] { 0, 1, 3 }));
        Assert.assertEquals(7, new MissingNumber().missingNumber(new int[] { 0, 1, 2, 3, 4, 5, 6, 8 }));
        Assert.assertEquals(1, new MissingNumber().missingNumber(new int[] { 0 }));
    }
}
