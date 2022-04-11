class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        // A hashmap to store remainder of sum so far with index
        HashMap<Integer, Integer> remIndex = new HashMap<Integer, Integer>();
        remIndex.put(0, -1); // Put remainder 0 with index -1 
        int sum = 0;
        for (int i=0; i<nums.length; i++) {
            sum += nums[i];
            // If sum % k is seen again which means middle values must be n*k so their remainder must be 0
            if (remIndex.containsKey(sum % k)) { 
                int j = remIndex.get(sum % k);
                // The size of subarray must be greater than 2
                if (i-j>=2) 
                    return true;
            } else {
                // Put remainder of sum with index in hashmap
                remIndex.put(sum % k, i);
            }                
        }
        return false;
    }
}