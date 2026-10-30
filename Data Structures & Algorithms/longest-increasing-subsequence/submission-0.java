class Solution {
    int dp[][];

    int solve(int []nums,int i,int p){
        int n=nums.length;

        if(i>=n)return 0;

        if(dp[i][p+1]!=-1)return dp[i][p+1];

        int skip=solve(nums,i+1,p);

        int take=0;

        if(p==-1||nums[p]<nums[i]){
            take=1+solve(nums,i+1,i);
        }
        return dp[i][p+1]=Math.max(take,skip);
    }
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;

        dp=new int[n][n+1];

        for(int row[]:dp){
            Arrays.fill(row,-1);
        }
        return solve(nums,0,-1);
        
    }
}
