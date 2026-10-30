class Solution {

    int[][]dp=new int[1001][1001];

    boolean solve(String s,int i,int j){
        if(i>=j)return true;

        if(dp[i][j]!=-1){
            return dp[i][j]==1;
        }
        if(s.charAt(i)==s.charAt(j)){
            boolean res= solve(s,i+1,j-1);

            dp[i][j]=res?1:0;
            
            return res;
        }

        dp[i][j]=0;
        return false;
    }
    public int countSubstrings(String s) {

        int n=s.length();
        for(int[]row:dp){
            Arrays.fill(row,-1);
        }

        int count=0;

        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                if(solve(s,i,j)){
                    count+=1;
                }
            }
        }
        return count;


        
    }
}
