class Solution {
    public int minimumSwaps(int[] nums) {
        int rMax = 0;
        int lMin = 0;
        int n = nums.length;
        
        for(int i = 1; i < n; i++){
            if(nums[i] >= nums[rMax]){
                rMax = i;
            }
            
            if(nums[i] < nums[lMin]){
                lMin = i;
            }
        }
        
        if(rMax == n-1 && lMin == 0) return 0;
        else if(rMax < lMin) return n - rMax - 1 + lMin - 1;
        else return n - rMax - 1 + lMin;
        
    }
}