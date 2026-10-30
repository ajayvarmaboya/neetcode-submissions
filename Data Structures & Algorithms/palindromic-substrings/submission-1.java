// 
class Solution {
    public int countSubstrings(String s) {

        int n=s.length();

        int dp[][]=new int[1001][1001];

        int count=0;

        for(int[]row:dp){
            Arrays.fill(row,0);
        }

        for(int l=1;l<=n;l++){
            for(int i=0;(i+l-1)<n;i++){
                int j=i+l-1;
                if(i==j){
                    dp[i][j]=1;
                }
                else if(i+1==j){
                    if(s.charAt(i)==s.charAt(j)) dp[i][j]=1;
                }
                else{
                    if(s.charAt(i)==s.charAt(j)&&(dp[i+1][j-1]==1)){
                        dp[i][j]=1;
                    }
                }
                if(dp[i][j]==1)count++;
            }
            
        }
        return count;
        
    }
}