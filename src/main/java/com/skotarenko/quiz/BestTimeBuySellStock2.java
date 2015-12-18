package com.skotarenko.quiz;

/**
 * Say you have an array for which the ith element is the price of a given stock on day i.

    If you were only permitted to complete at most one transaction (ie, buy one and sell one share of the stock),
     design an algorithm to find the maximum profit.
 * @author maxyms
 *
 */
public class BestTimeBuySellStock2 {
    public int maxProfit(int[] prices) {
        return maxProfitFast(prices);
    }

    public int maxProfitFast(int[] prices) {
        int d = -1, l = prices.length, maxProfit = 0, buy = 0;
        for (int p = 0; p < l - 1; p++) {
            int sig = (int) Math.signum(prices[p + 1] - prices[p]);
            if (d > 0 && sig < 0) {
                maxProfit += prices[p] - buy;
            }
            if (d < 0 && sig > 0) {
                buy = prices[p];
            }
            d = sig == 0 ? d : sig;
        }
        if (d > 0) {
            maxProfit += prices[l - 1] - buy;
        }
        return maxProfit;
    }
}
