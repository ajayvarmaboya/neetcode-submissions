class Solution {

    // Boolean [][] dp;

    // boolean solve(int n,int sum,int nums[]){
    //     if(sum==0)return true;

    //     if(n==0) return false;

    //     if(dp[n][sum]!=null)return dp[n][sum];



    //     boolean skip=solve(n-1,sum,nums);

    //     boolean take=false;

    //     if(nums[n-1]<=sum){
    //         take=solve(n-1,sum-nums[n-1],nums);
    //     }
    //     return dp[n][sum]= skip || take;
    // }
    public boolean canPartition(int[] nums) {

        int n=nums.length;

        int sum=0;

        for(int num:nums){
            sum+=num;
        }

        if(sum%2!=0)return false;

        int tar=sum/2;

        boolean[][] dp=new boolean[n+1][tar+1];

        for(int i=0;i<=n;i++){
            dp[i][0]=true;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=tar;j++){
                boolean skip=dp[i-1][j];

                boolean take=false;

                if(nums[i-1]<=j)  take=dp[i-1][j-nums[i-1]];

                dp[i][j]=take||skip;
            }
        }
        return dp[n][tar];

        // return solve(n,tar,nums);
        
    }
}
