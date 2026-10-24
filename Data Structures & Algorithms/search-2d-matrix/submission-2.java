class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            if(target>=matrix[i][0] && target<=matrix[i][m-1]){
                return bs(matrix[i],target);
            }
        }
        return false;
        
    }
    public boolean bs(int arr[],int tar){
        int low=0,high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(arr[mid]==tar){
                return true;
            }
            else if(arr[mid]<tar){
                low=mid+1;
            }
            else{
                high=mid-1;
            }
        }
        return false;
    }
}
