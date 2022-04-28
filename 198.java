class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        if(n == 0) return 0;
        
        int[] maxAmount = new int[nums.length + 1];
        
        maxAmount[n] = 0;
        maxAmount[n - 1] = nums[n - 1];
        
        for (int i = n - 2; i>= 0; --i) {
            maxAmount[i] = Math.max(maxAmount[i + 1], maxAmount[i + 2] + nums[i]);
        }
        
        return maxAmount[0];
    }
}