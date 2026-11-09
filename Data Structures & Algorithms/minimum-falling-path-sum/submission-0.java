class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int n=matrix.length;
        int dp[][]=new int [n][n];

        for(int col=0;col<n;col++){
            dp[n-1][col]=matrix[n-1][col];
        }

        for(int row=n-2;row>=0;row--){
            for(int col=0;col<n;col++){
                int down=dp[row+1][col];

                int left=Integer.MAX_VALUE;

                if(col>0){
                    left=dp[row+1][col-1];
                }

                int right=Integer.MAX_VALUE;

                if(col<n-1){
                    right=dp[row+1][col+1];
                }

                dp[row][col]=matrix[row][col]+Math.min(down,Math.min(left,right));
            }
        }
        int ans=Integer.MAX_VALUE;

        for(int col=0;col<n;col++){
            ans=Math.min(ans,dp[0][col]);
        }
        return ans;

    }
}
