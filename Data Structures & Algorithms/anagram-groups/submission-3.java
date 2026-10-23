class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>>res=new HashMap<>();

        for(String s:strs){

            char []ch=s.toCharArray();
            Arrays.sort(ch);

            String key=new String(ch);

            res.putIfAbsent(key,new ArrayList<>());

            res.get(key).add(s);


        }
        return new ArrayList<>(res.values());
    }
}
