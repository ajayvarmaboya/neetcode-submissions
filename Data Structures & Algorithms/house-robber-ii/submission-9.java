class Solution {
    
    public int rob(int[] nums) {

        int n=nums.length;

        if(n==1)return nums[0];

        if(n<=2)return Math.max(nums[0],nums[1]);

        int first_house=solve(nums,0,n-2);
        int second_house=solve(nums,1,n-1);

        return Math.max(first_house,second_house);
        
    }
    int solve(int nums[],int l,int r){
        int prev=0;
        int prevprev=0;

        for(int i=l;i<=r;i++){
            int skip=prev;

            int steal=nums[i]+prevprev;

            int temp=Math.max(skip,steal);

            prevprev=prev;
            prev=temp;
        }
        return prev;
    }
}
