class Solution {
    public boolean hasDuplicate(int[] nums) {
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                if (nums[j] + nums[i] == nums[j] * 2){
                    return true;
                }
            }
        }
        return false;
    }
}