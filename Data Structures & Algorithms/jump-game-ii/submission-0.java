class Solution {

    int[] dp=new int[1001];

    int solve(int idx,int []nums){
        if(idx == nums.length-1)return 0;

        if(idx>=nums.length)return Integer.MAX_VALUE;

        if(dp[idx]!=-1)return dp[idx];

        int maxJumps=Math.min(nums.length-1,idx+nums[idx]);

        int minJumps=Integer.MAX_VALUE;

        for(int next=idx+1;next<=maxJumps;next++){
            int result=solve(next,nums);
            if(result!=Integer.MAX_VALUE){
                minJumps=Math.min(minJumps,1+result);
            }
        }
        return dp[idx]=minJumps;
    }
    public int jump(int[] nums) {
        
        Arrays.fill(dp,-1);
        return solve(0,nums);
        


        
    }
}
