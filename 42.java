class Solution {
    public int trap(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int maxL = height[l];
        int maxR = height[r];
        int ans = 0;
        while(l < r){
            // make sure the reason why we are comparing the global left max and right max is because that 
            // the trapped water is determined by these two variables instead of the current left and right.
            if(maxL < maxR) {
                ans += maxL - height[l];
                maxL = Math.max(maxL, height[++l]);
            } else {
                ans += maxR - height[r];
                maxR = Math.max(maxR, height[--r]);
            }
        }
        return ans;
    }
}