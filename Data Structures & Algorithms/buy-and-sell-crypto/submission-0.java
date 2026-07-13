class Solution {
    public int maxProfit(int[] prices) {

        int buy = prices[0];
        int maxProfit = 0;

        for (int sell = 1; sell < prices.length; sell++) {

            if (prices[sell] < buy) {
                buy = prices[sell];
            } else {
                maxProfit = Math.max(maxProfit, prices[sell] - buy);
            }
        }

        return maxProfit;
    }
}