class Solution {
    public int maxProfit(int[] prices) {
        int maxP = 0;
        int minBuy = Integer.MAX_VALUE;

        for (int sell : prices) {
            maxP = Math.max(maxP, sell - minBuy);
            minBuy = Math.min(minBuy, sell);
        }
        return maxP;
    }
}
