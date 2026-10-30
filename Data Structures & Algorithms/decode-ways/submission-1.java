class Solution {

    int[]dp=new int[101];

    int solve(int i,int n,String s){
        if(i==n)return 1;

        if(dp[i]!=-1){
            return dp[i];
        }

        if(s.charAt(i)=='0')return 0;

        int res=solve(i+1,n,s);

        if(i+1<n){
            if(s.charAt(i)=='1'||s.charAt(i)=='2'&&s.charAt(i+1)<='6'){
                res+=solve(i+2,n,s);
            }
        }
        return dp[i]=res;

    }
    public int numDecodings(String s) {

        int n=s.length();

        Arrays.fill(dp,-1);

        return solve(0,n,s);
        
    }
}
