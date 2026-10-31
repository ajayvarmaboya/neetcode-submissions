class Solution {

    int maxDp[];
    int minDp[];

    int solve(int[] nums,int i ) {

        if(i==0){
            maxDp[0]=nums[0];
            minDp[0]=nums[0];
            return maxDp[0];
        }

        if(maxDp[i]!=Integer.MIN_VALUE)return maxDp[i];
        // Calculate previous state
        solve(nums,i-1);


        int a=nums[i];

        int b=nums[i]*maxDp[i-1];

        int c=nums[i]*minDp[i-1];

        maxDp[i]=Math.max(a,Math.max(b,c));

        minDp[i]=Math.min(a,Math.min(b,c));

        return maxDp[i];
        
    }

    public int maxProduct(int[] nums) {

        int n=nums.length;

        maxDp=new int[n];
        minDp=new int[n];


        Arrays.fill(maxDp,Integer.MIN_VALUE);
        int ans=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){
            ans=Math.max(ans,solve(nums,i));

        }
        return ans;

        
    }
}