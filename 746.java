class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] minCost = new int[n + 1];
        Arrays.fill(minCost, 0);
        
        for (int i = 2; i < n + 1; i++) {
            minCost[i] = Math.min(minCost[i - 1] + cost[i - 1], minCost[i - 2] + cost[i - 2]);
        }
        return minCost[n];
        
    }
}