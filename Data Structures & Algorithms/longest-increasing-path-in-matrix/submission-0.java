class Solution {
    int m,n;
    int [][]dp;
    int [][]dirs={{-1,0},{1,0},{0,-1},{0,1}};

    int dfs(int [][]matrix,int i,int j){
        if(dp[i][j]!=0)return dp[i][j];

        int result=1;
        for(int[]dir:dirs){
            int nr=i+dir[0];
            int nc=j+dir[1];

            if(nr>=0 && nr<m && nc>=0 && nc<n && matrix[nr][nc]>matrix[i][j]){
                result=Math.max(result,1+dfs(matrix,nr,nc));
            }
        }
        dp[i][j]=result;
        return result;

    }
    public int longestIncreasingPath(int[][] matrix) {
        m=matrix.length;
        n=matrix[0].length;

        dp=new int[m][n];

        int ans=0;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                ans=Math.max(ans,dfs(matrix,i,j));
            }
        }
        return ans;

        
    }
}
