/**
    Leetcode: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
**/    
class Solution {
    public int maxProfit(int[] prices) {
        int l = 0; // buy
        int r = 1; // sell
        int maxP = 0;
        while (r < prices.length) {
            if (prices[l] < prices[r]) {
                int profit = prices[r] - prices[l];
                maxP = Math.max(maxP, profit);
            } else {
                l = r;
            }
            r++;
        }
        return maxP;
    }
}
