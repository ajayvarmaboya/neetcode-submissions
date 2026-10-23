class Solution {
    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int left=0,right=s.length()-1;

        while(left<right){
        //     if(!Character.isLetterOrDigit(s.charAt(left))){
        //         left++;
        //         continue;
        //     }
        //     if(!Character.isLetterOrDigit(s.charAt(right))){
        //         right--;
        //         continue;
        //     }
        //     if(Character.toLowerCase(s.charAt(left))!=Character.toLowerCase(s.charAt(right))){
        //         return false;
        //     }
        //     else{
        //         left++;
        //         right--;
        //     }
        // }
        if(s.charAt(left)!=s.charAt(right)){
            return false;
        }
        else{
            left++;
            right--;
        }
        
        }
        return true;
        
    }
}
