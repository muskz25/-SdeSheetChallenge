class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int currBuy=prices[0];
        for(int i=1;i<prices.length;i++){
            currBuy=Math.min(currBuy,prices[i]);
            maxProfit=Math.max(maxProfit,prices[i]-currBuy);
        }

        return maxProfit;
    }
}
