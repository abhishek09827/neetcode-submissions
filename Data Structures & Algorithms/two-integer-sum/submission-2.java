class Solution {
    public int[] twoSum(int[] nums, int target) {
        int l = nums.length;
        HashMap<Integer, Integer> prevMap = new HashMap<>();
        for(int i = 0; i<l; i++ ){
            int n = nums[i];
            int t = target - n;
            if (prevMap.containsKey(t)) {
                return new int[] { prevMap.get(t), i };
            }

            prevMap.put(n, i);
    }
    return new int[]{-1, -1}; 
    }
}