class Solution {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int [] res = new int [n+n];
        for(int i = 0; i<n; i++){
            res[i] = nums[i];
        }int j = 0;
        for(int i = n; i<2*n; i++){
            res[i] = nums[j++];
        }
        return res;
    }
}