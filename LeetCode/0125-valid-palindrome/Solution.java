class Solution {
    public boolean isPalindrome(String s) {
        String ss = s.toLowerCase();
        String result = "";
        for(int i=0;i<ss.length();i++){
            if(Character.isLetterOrDigit(ss.charAt(i))){
                result += ss.charAt(i);
            }
        }
        int left = 0;
        int right = result.length()-1;
        while(left < right){
            if(result.charAt(left) != result.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}