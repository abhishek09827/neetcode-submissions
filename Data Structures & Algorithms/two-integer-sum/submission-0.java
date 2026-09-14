class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        for(int i = 0; i<l; i++ ){
            int t = target - nums[i];
            for(int j = 0; j<l; j++ ){
                if(i!=j && nums[j] == t){
                    return new int[]{i, j}; 
                }
        }
    }
    return new int[]{-1, -1}; 
    }
}