package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class CountPrimesTest {
    @Test
    public void test() {
        Assert.assertEquals(4, new CountPrimes().countPrimes(10));
        Assert.assertEquals(8, new CountPrimes().countPrimes(20));
        Assert.assertEquals(10, new CountPrimes().countPrimes(30));
    }
}
