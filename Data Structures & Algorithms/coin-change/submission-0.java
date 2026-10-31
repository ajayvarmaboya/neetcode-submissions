class Solution {
    int []dp;
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;

        dp=new int[amount+1];

        Arrays.fill(dp,-1);

        int ans=solve(coins,amount);

        return ans==Integer.MAX_VALUE?-1:ans;
        
    }
    int solve(int[]coins,int amount){
        if(amount==0) return 0;

        if(amount<0)return Integer.MAX_VALUE;

        if(dp[amount]!=-1)return dp[amount];

        
        int min=Integer.MAX_VALUE;

        for(int coin:coins){
            int result=solve(coins,amount-coin);
            if(result!=Integer.MAX_VALUE){
                min=Math.min(min,1+result);
            }


        }
        return dp[amount]= min;
    }
}
