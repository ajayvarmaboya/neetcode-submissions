class Solution {
    int [][]dp=new int[5001][2];

    int solve(int[]prices,int day,int n,int buy){
        if(day>=n)return 0;

        if(dp[day][buy]!=-1){
            return dp[day][buy];
        }

        int profit=Integer.MIN_VALUE;
        if(buy==1){
            int take=solve(prices,day+1, n,0)-prices[day];
            int not_take=solve(prices,day+1,n,1);
            profit=Math.max(profit,Math.max(take,not_take));
        }
        else{
            int sell=prices[day]+solve(prices,day+2,n,1);
            int not_sell=solve(prices,day+1,n,0);

            profit=Math.max(profit,Math.max(sell,not_sell));
        }
        return dp[day][buy]=profit;
    }
    public int maxProfit(int[] prices) {

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }

        int buy=1;
        int n=prices.length;
        return solve(prices,0,n,buy);
        
    }
}
