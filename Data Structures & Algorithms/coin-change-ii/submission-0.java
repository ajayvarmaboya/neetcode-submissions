class Solution {

    int dp[][];

    int solve(int i,int amount,int []coins){

        if (amount ==0)return 1;
        if (i==coins.length)return 0;
        if(dp[i][amount]!=-1)return dp[i][amount];

        if(coins[i]>amount){
            return dp[i][amount]=solve(i+1,amount,coins);
        }

        
        int take=solve(i,amount-coins[i],coins);
        int skip=solve(i+1,amount,coins);

        return dp[i][amount]=take+skip;


    }
    public int change(int amount, int[] coins) {

        int n=coins.length;

        dp=new int[n+1][amount+1];

        for(int []row:dp){
            Arrays.fill(row,-1);
        }
        return solve(0,amount,coins);
        
    }
}
