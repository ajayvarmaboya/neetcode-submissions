class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int k=s1.length();
        int n=s2.length();
        if (k > n) return false;
        int freq[]=new int[26];
        int wfreq[]=new int[26];

        for(int i=0;i<k;i++){
            freq[s1.charAt(i)-'a']++;
        }
        for(int i=0;i<k;i++){
            wfreq[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq,wfreq))return true;

        for(int i=k;i<n;i++){
            wfreq[s2.charAt(i-k)-'a']--;
            wfreq[s2.charAt(i)-'a']++;

            if(Arrays.equals(freq,wfreq))return true;
        }
        return false;

        
    }
}
