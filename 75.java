class Solution {
    public void sortColors(int[] nums) {
        int zero = 0;
        int one = 0;
        int two = 0;
        for(int i : nums){
            if(i == 0) zero++;
            else if(i == 1) one++;
            else two++;
        }
        
        int k = 0;
        while(zero >0){
            nums[k++] = 0;
            zero--;
        }
        while(one >0){
            nums[k++] = 1;
            one--;
        }
        while(two >0){
            nums[k++] = 2;
            two--;
        }
    }
}