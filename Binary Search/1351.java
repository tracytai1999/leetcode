class Solution {
    public int countNegatives(int[][] grid) {
        int ans = 0;
        int idx = -1;
        for(int[] temp: grid) {
            for(int i = 0; i<temp.length; i++) {
                if(temp[i] < 0) {
                    idx = i;
                    break;
                }
            }
            if(idx != -1) {
                ans = ans + (temp.length - idx);
                idx = 0;
            }
        }
        
        return ans;
    }
}