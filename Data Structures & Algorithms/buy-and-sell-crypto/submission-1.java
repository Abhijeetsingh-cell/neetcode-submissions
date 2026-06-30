class Solution {
    public int maxProfit(int[] prices) {
        int minprice = prices[0];
        int max = 0;
        for(int i = 1; i<prices.length; i++){
            if(minprice > prices[i]){
                minprice = prices[i];
            }
            max = Math.max(max,prices[i]-minprice);
        }
        return max;
    }
}
