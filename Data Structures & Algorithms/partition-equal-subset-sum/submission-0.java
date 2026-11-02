class Solution {

    Boolean [][] dp;

    boolean solve(int n,int sum,int nums[]){
        if(sum==0)return true;

        if(n==0) return false;

        if(dp[n][sum]!=null)return dp[n][sum];



        boolean skip=solve(n-1,sum,nums);

        boolean take=false;

        if(nums[n-1]<=sum){
            take=solve(n-1,sum-nums[n-1],nums);
        }
        return dp[n][sum]= skip || take;
    }
    public boolean canPartition(int[] nums) {

        int n=nums.length;

        int sum=0;

        for(int num:nums){
            sum+=num;
        }

        if(sum%2!=0)return false;

        int tar=sum/2;

        dp=new Boolean[n+1][tar+1];

        return solve(n,tar,nums);
        
    }
}
