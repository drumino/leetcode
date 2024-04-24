class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] range = {-1, -1};
        if(nums.length == 0)
            return range;
        for(int i = 0; i < nums.length; i++){
            if(range[0] == -1 && nums[i] == target){
                range[0] = i;
            }
            if(nums[i] == target){
                range[1] =i;
            }
        }
        return range; 
    }
}