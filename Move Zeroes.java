class Solution {
    public void moveZeroes(int[] nums) {
        if (nums == null || nums.length == 0)
            return;
        int result = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[result] = nums[i];
                result++;
            }
        }
        while (result < nums.length) {
            nums[result] = 0;
            result++;
        }
    }
}