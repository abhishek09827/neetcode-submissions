class Solution {
    public boolean hasDuplicate(int[] nums) {
       int i = 0;
       int l = nums.length;
       while(i<l - 1){
        for(int j = i +1; j< l; j++){
            if(nums[i] == nums[j]) return true;
        }
        i++;
       }
       return false;
    }
}