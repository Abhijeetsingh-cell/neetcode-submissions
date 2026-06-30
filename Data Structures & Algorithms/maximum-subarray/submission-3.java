class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int i = 0;
        if(nums.length == 1){
            return nums[0];
        }
        int maxsum = Integer.MIN_VALUE;
        for(int j = 0; j<nums.length; j++){
            sum = sum + nums[j];
            maxsum = Math.max(sum,maxsum);
            if(sum < 0){
                sum = 0;
            }
            
        }
        return maxsum;
    }
}
