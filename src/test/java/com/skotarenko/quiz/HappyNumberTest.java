package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;

public class HappyNumberTest {
    @Test
    public void test() {
        Assert.assertTrue("19 is happy", new HappyNumber().isHappy(19));
        Assert.assertFalse("20 is happy", new HappyNumber().isHappy(20));
        Assert.assertTrue("44 is happy", new HappyNumber().isHappy(44));
        Assert.assertTrue("49 is happy", new HappyNumber().isHappy(49));
    }

    @Test
    @Ignore
    public void test2() {
        for (int i = 0; i < 50; i++) {
            System.out.println(i + " is happy? " + new HappyNumber().isHappy(i));
        }
    }
}
