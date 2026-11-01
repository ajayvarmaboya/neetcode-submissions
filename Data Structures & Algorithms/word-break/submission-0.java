class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {

        Set<String>set=new HashSet(wordDict);

        int n=s.length();

        boolean[] dp=new boolean[n+1];

        dp[n]=true;

        for(int idx=n-1;idx>=0;idx--){
            for(int l=1;l+idx<=n;l++){
                String temp=s.substring(idx,idx+l);

                if(set.contains(temp)&&dp[idx+l]){
                    dp[idx]=true;
                    break;
                }
            }
        }
        return dp[0];
        
    }
}
