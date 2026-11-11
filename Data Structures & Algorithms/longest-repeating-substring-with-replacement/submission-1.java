class Solution {
    public int characterReplacement(String s, int k) {

        int n=s.length();
        int maxlen=0;
        
        int freq[]=new int[26];
        int maxFreq=0;
        int left=0;

        for(int j=0;j<n;j++){
                int idx=s.charAt(j)-'A';
                freq[idx]++;

                maxFreq=Math.max(maxFreq,freq[idx]);

                while((j-left+1)-maxFreq>k){
                    freq[s.charAt(left)-'A']--;
                    left++;

                }
                maxlen=Math.max(maxlen,(j-left+1));
            }
        
        return maxlen;
        
    }
}
