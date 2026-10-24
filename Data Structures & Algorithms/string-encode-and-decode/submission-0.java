class Solution {

    public String encode(List<String> strs) {

        StringBuilder sb=new StringBuilder();

        for(String s:strs){
            sb.append(s.length())
                .append('#')
                .append(s);
        }
        return sb.toString();

    }

    public List<String> decode(String str) {

        List<String>res=new ArrayList<>();
        int i=0;
        while(i<str.length()){
            int j=i;

            while(str.charAt(j)!='#'){
                j++;
            }
            int len=Integer.parseInt(str.substring(i,j));

            int start=j+1;
            int end=len+start;

            res.add(str.substring(start,end));
            i=end;
        }
        return res;

    }
}
