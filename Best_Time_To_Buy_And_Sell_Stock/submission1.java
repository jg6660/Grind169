class Solution {
    public int maxProfit(int[] prices) {
     int profit = 0, max_profit = 0;
     int min_price = prices[0];
     for(int i=1; i<prices.length; i++){
         if(min_price > prices[i]){
             min_price = prices[i];
         }
         else{
             profit = prices[i] - min_price;
             max_profit = Math.max(max_profit, profit);
         }
     }

     return max_profit;
}
}
