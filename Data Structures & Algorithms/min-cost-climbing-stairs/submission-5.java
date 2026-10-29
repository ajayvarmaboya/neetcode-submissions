class Solution {
    int[] dp = new int[101];

    int solve(int i,int cost[]){
        if(i>=cost.length)return 0;

        if(dp[i]!=-1){
            return dp[i];
        }

        return dp[i]=cost[i]+Math.min(solve(i+1,cost),solve(i+2,cost));
    }
    
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;

        if(n<=2)return Math.min(cost[0],cost[1]);

        Arrays.fill(dp,-1);

        return Math.min(solve(0,cost),solve(1,cost));
        
    }
    
}
