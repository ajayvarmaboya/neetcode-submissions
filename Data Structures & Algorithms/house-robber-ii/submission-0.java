class Solution {
    int[] dp=new int[101];

    int solve(int nums[],int i,int n){
        if(i>n)return 0;

        if(dp[i]!=-1)return dp[i];

        int steal=nums[i]+solve(nums,i+2,n);

        int skip=solve(nums,i+1,n);

        return dp[i]=Math.max(steal,skip);
    }
    
    public int rob(int[] nums) {

        int n=nums.length;

        if(n==1)return nums[0];

        if(n<=2)return Math.max(nums[0],nums[1]);

        Arrays.fill(dp,-1);

        int first_house=solve(nums,0,n-2);

        Arrays.fill(dp,-1);

        int last_house=solve(nums,1,n-1);

        return Math.max(first_house,last_house);

        
    }
}
