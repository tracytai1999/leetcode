class Solution {
    public int singleNonDuplicate(int[] nums) {
        int res = -1;
        if (nums.length == 1) return res = nums[0];
        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                if (nums[i] != nums[i + 1]) {
                    res = nums[i];
                }
            }else if (i == nums.length - 1) {
                if (nums[i] != nums[i - 1]) {
                    res = nums[i];
                }
            } else {
                if (nums[i] != nums[i + 1] && nums[i] != nums[i - 1]) {
                    res = nums[i];
                }
            }
        }
        return res;
    }
}