class Solution {
    int dp[][]=new int[101][101];

    // int solve(String s1,String s2,int i,int j){
    //     if(i==s1.length()){
    //         return s2.length()-j;
    //     }
    //     if(j==s2.length()){
    //         return s1.length()-i;
    //     }

    //     if(dp[i][j]!=-1){
    //         return dp[i][j];
    //     }

    //     if(s1.charAt(i)==s2.charAt(j)){
    //         return dp[i][j]= solve(s1,s2,i+1,j+1);
    //     }
        
    //         int insert=1+solve(s1,s2,i,j+1);
    //         int delete=1+solve(s1,s2,i+1,j);
    //         int replace=1+solve(s1,s2,i+1,j+1);
    //         return dp[i][j]=Math.min(insert,Math.min(delete,replace));


    //regverse loop

    int solve(String s1,String s2,int m,int n){
       if(m==0){
        return n;//insertion
       }
       if(n==0){
        return m;//deletion
       }

        if(dp[m][n]!=-1){
            return dp[m][n];
        }

        if(s1.charAt(m-1)==s2.charAt(n-1)){
            return dp[m][n]= solve(s1,s2,m-1,n-1);
        }
        
            int insert=1+solve(s1,s2,m,n-1);
            int delete=1+solve(s1,s2,m-1,n);
            int replace=1+solve(s1,s2,m-1,n-1);
            return dp[m][n]=Math.min(insert,Math.min(delete,replace));

        
        
        

        
    }
    public int minDistance(String word1, String word2) {

        for(int[] row:dp){
            Arrays.fill(row,-1);
        }

        int m=word1.length();

        int n=word2.length();

        return solve(word1,word2,m,n);
        
    }
}
