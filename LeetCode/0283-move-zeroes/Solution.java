class Solution {
    public void moveZeroes(int[] nums) {
       
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0){
                nums[c] = nums[i];
                c++;
            }
        }
        int i=c;
        while(i<nums.length){
            nums[i]=0;
            i++;
        }
    }
}