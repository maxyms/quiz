package com.skotarenko.quiz;

import org.junit.Assert;
import org.junit.Test;

public class BestTimeBuySellStockTest2 {
    @Test
    public void testName() throws Exception {
        Assert.assertEquals(7, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 7, 7, 2, 7 }));
        Assert.assertEquals(4, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 7, 7, 9 }));
        Assert.assertEquals(6, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 7, 7, 9, 2, 1, 3 }));
        Assert.assertEquals(12, new BestTimeBuySellStock2().maxProfit(new int[] { 4, 5, 4, 3, 5, 6, 7, 2, 9 }));
        Assert.assertEquals(0, new BestTimeBuySellStock2().maxProfit(new int[] {}));
        Assert.assertEquals(0, new BestTimeBuySellStock2().maxProfit(new int[] { 2 }));
        Assert.assertEquals(0, new BestTimeBuySellStock2().maxProfit(new int[] { 2, 1 }));
        Assert.assertEquals(4, new BestTimeBuySellStock2().maxProfit(new int[] { 2, 6 }));
        Assert.assertEquals(13, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 9, 6, 3, 5, 4, 6, 8, 11, 10 }));
        Assert.assertEquals(18, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 9, 6, 3, 5, 4, 5, 1, 2, 0, 10 }));
        Assert.assertEquals(9, new BestTimeBuySellStock2().maxProfit(new int[] { 5, 7, 9, 6, 3, 5, 4, 5, 1, 2, 0, 1 }));
        Assert.assertEquals(10, new BestTimeBuySellStock2().maxProfit(new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11 }));
        int N = 100000;
        int price = 10000;
        int[] trs = new int[N];
        for (int i = 0; i < N; i++) {
            trs[i] = price;
            if (price > 0) {
                price--;
            }
        }
        Assert.assertEquals(0, new BestTimeBuySellStock().maxProfit(trs));
    }
}
