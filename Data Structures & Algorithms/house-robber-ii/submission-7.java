class Solution {
    
    public int rob(int[] nums) {

        int n=nums.length;

        if(n==1)return nums[0];

        if(n<=2)return Math.max(nums[0],nums[1]);

        int[]dp=new int[n+1];

        dp[0]=0;

        for(int i=1;i<=n-1;i++){
            int steal=nums[i-1]+((i-2>=0)?dp[i-2]:0);
            int skip=dp[i-1];

            dp[i]=Math.max(steal,skip);
        }
        int res1=dp[n-1];

        Arrays.fill(dp,0);

        dp[0]=0;
        dp[1]=0;

         for(int i=2;i<=n;i++){
            int steal=nums[i-1]+((i-2>=0)?dp[i-2]:0);
            int skip=dp[i-1];

            dp[i]=Math.max(steal,skip);
        }
        int res2=dp[n];

        return Math.max(res1,res2);
        
    }
}
