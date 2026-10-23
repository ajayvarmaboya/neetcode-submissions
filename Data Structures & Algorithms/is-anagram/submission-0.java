class Solution {
    public boolean isAnagram(String s, String t) {

        Hashtable<Character,Integer>smap=new Hashtable<>();
        Hashtable<Character,Integer>tmap=new Hashtable<>();

        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);

            smap.put(ch,smap.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<t.length();i++){
            char ch=t.charAt(i);

            tmap.put(ch,tmap.getOrDefault(ch,0)+1);
        }

        
        return smap.equals(tmap);




    }
}
