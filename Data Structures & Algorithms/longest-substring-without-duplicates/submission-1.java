class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n=s.length();
        int maxlen=0;
        int left=0;
        Set<Character>set=new HashSet<>();

        
        for(int i=0;i<n;i++){
            
           char c=s.charAt(i);
           while(set.contains(c)){
                set.remove(s.charAt(left));
                left++;
           }
           set.add(c);
           maxlen=Math.max(maxlen,i-left+1);
                
                
            
            
        }
        return maxlen;
        
    }
}
