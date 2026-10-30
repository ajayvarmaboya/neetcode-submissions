
class Solution {

    int dp[][] = new int[1001][1001];

    boolean solve(String s, int i, int j) {

        if(i >= j) return true;

        if(dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        if(s.charAt(i) == s.charAt(j)) {

            boolean result=
                solve(s, i + 1, j - 1) ;

            dp[i][j] = result ? 1 : 0;

            return result;
        }

        dp[i][j] =0;
        return false;
    }

    public String longestPalindrome(String s) {

        int n = s.length();

        for(int row[] : dp) {
            Arrays.fill(row, -1);
        }

        int sp = 0;
        int maxLen = 0;

        for(int i = 0; i < n; i++) {

            for(int j = i; j < n; j++) {

                if(solve(s, i, j)) {

                    if((j - i + 1) > maxLen) {

                        maxLen = j - i + 1;
                        sp = i;
                    }
                }
            }
        }

        return s.substring(sp, sp + maxLen);
    }
}
