class Solution {

    int m,n;

    int [][] dp=new int [1001][1001];

    int solve(String s,String t,int i,int j){

        if(j==n){
            return 1;
        }
        if(i==m){
            return 0;
        }

        if(dp[i][j]!=-1)return dp[i][j];

        if(s.charAt(i)==t.charAt(j)){
            dp[i][j]=solve(s,t,i+1,j+1)+solve(s,t,i+1,j);
        }
        else{
            dp[i][j]=solve(s,t,i+1,j);
        }
        return dp[i][j];

    }
    public int numDistinct(String s, String t) {

        m=s.length();
        n=t.length();

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }
        return solve(s,t,0,0);
        
    }
}
