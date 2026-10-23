class Solution {
    public int maxArea(int[] heights) {

        int maxarea=0;
        int left=0,right=heights.length-1;

        while(left<right){
            int h=Math.min(heights[left],heights[right]);
            int w=right-left;
            int area=h*w;
            maxarea=Math.max(area,maxarea);

            if(heights[left]<=heights[right]){
                left++;
            }else{
                right--;
            }
            
            
            
        }
        return maxarea;
        
    }
}
