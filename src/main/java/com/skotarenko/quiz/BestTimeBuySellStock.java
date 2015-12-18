package com.skotarenko.quiz;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
     design an algorithm to find the maximum profit.
 * @author maxyms
 *
 */
public class BestTimeBuySellStock {
    public int maxProfit(int[] prices) {
        return maxProfitFast(prices);
    }

    public int maxProfitFast(int[] prices) {
        int l = prices.length, maxProfit = 0, buy = 0;
        for (int p = 0; p < l; p++) {
            maxProfit = Math.max(maxProfit, prices[p] - prices[buy]);
            if (prices[p] < prices[buy]) {
                buy = p;
            }
        }
        return maxProfit;
    }

    public int maxProfitAnton(int[] prices) {
        int min = Integer.MAX_VALUE, max = 0;
        for (int i = 0; i < prices.length; i++) {
            min = Math.min(min, prices[i]);
            max = Math.max(max, prices[i] - min);
        }
        return max;
    }

    public int maxProfitBrut(int[] prices) {
        int l = prices.length;
        if (l == 0 || l == 1) {
            return 0;
        }
        int profit = 0, maxProfit = 0;
        for (int i = 0; i < l; i++) {
            for (int j = i + 1; j < l; j++) {
                profit = prices[j] - prices[i];
                if (profit > 0 && profit > maxProfit) {
                    maxProfit = profit;
                }
            }
        }
        return maxProfit;
    }
}
