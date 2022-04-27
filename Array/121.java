class Solution {
    public int maxProfit(int[] prices) {
        int max = 0;
        int min = Integer.MAX_VALUE;
        int prof = 0;
        for (int i = 0; i < prices.length; i++){
            if (prices[i] < min) {
                min = prices[i];
            }
            prof = prices[i] - min;
            if (prof > max) {
                max = prof;
            }
            
        }
        return max;
    }
}