class Solution {
    public int maxProfit(int[] prices) {
          int buy=prices[0];
        int profit=0;
        for(int i:prices){
            if(buy>i){
                buy=i;
            }
            profit=Math.max(profit, i-buy);
        }
        return profit; 
    }
}