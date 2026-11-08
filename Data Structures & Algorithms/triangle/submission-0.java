class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();

        List<List<Integer>>tri=new ArrayList<>();

        for(List<Integer>row:triangle){
            tri.add(new ArrayList<>(row));
        }

        for(int row=n-2;row>=0;row--){
            for(int col=0;col<=row;col++){
                tri.get(row).set(col,
                    tri.get(row).get(col)+
                    Math.min(
                        tri.get(row+1).get(col),
                        tri.get(row+1).get(col+1)
                    )
                );
            
            }
        }
        return tri.get(0).get(0);
        
    }
}