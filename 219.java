class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
           // Approach:
            // Using sliding window technique.
            // Traversing from left to right, we use a HashSet to store the integers that we saw.
        // If the same integer is seen again, we have found the duplicate.
      // Then, we update the window again to be within 'k' index from 'index
        if (k ==0) return false;
        Set<Integer> slidingWindow = new HashSet();
        for(int i = 0; i<nums.length; i++){
            if(slidingWindow.contains(nums[i])) return true;
              // Update the state of the window, but removing the leftmost integer and add the new integer.
            if(i >= k)
                slidingWindow.remove(nums[i - k]);
            slidingWindow.add(nums[i]);
        }
        return false;
    }
}