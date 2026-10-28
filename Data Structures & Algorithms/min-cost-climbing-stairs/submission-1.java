class Solution {
    int[] t=new int[1001];
    int solve(int idx,int[]cost){
        if(idx>=cost.length){
            return 0;
        }

        if(t[idx]!=-1){
            return t[idx];
        }
        int a=cost[idx]+solve(idx+1,cost);
        int b=cost[idx]+solve(idx+2,cost);
        return t[idx]=Math.min(a,b);
    }
    
    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;

        Arrays.fill(t,-1);

        return Math.min(solve(0,cost),solve(1,cost));
        
    }
    
}
