class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=Integer.MIN_VALUE;

        for(int i=0;i<prices.length;i++){
            int j=i+1;
            while(j<prices.length){
                int profit=prices[j]-prices[i];
                maxProfit=Math.max(maxProfit,profit);
                j++;
            }
        }
        return maxProfit>=0?maxProfit:0;
        
    }
}
