class Solution {
    // int dp[][];

    // int solve(int []nums,int i,int p){
    //     int n=nums.length;

    //     if(i>=n)return 0;

    //     if(dp[i][p+1]!=-1)return dp[i][p+1];

    //     int skip=solve(nums,i+1,p);

    //     int take=0;

    //     if(p==-1||nums[p]<nums[i]){
    //         take=1+solve(nums,i+1,i);
    //     }
    //     return dp[i][p+1]=Math.max(take,skip);
    // }
    public int lengthOfLIS(int[] nums) {

        int n=nums.length;

        int []dp=new int[n+1];

        int maxLIS=1;


        Arrays.fill(dp,1); ///each num is sub sequnece of itself dp[1,1,1,1,1]


        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                if(nums[j]<nums[i]){
                    dp[i]=Math.max(dp[i],dp[j]+1);

                    maxLIS=Math.max(dp[i],maxLIS);
                }
            }
        }
        return maxLIS;
        
    }
}
