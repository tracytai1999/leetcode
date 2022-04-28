class Solution {
    public int maxSubArray(int[] nums) {
        int dp[] = new int[nums.length];
        int max = Integer.MIN_VALUE;
        if (nums.length <= 1) return nums[0];
        dp[0] = nums[0];
        max = dp[0];
        for (int i = 1; i < nums.length; i++) {
            dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
