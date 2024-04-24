class Solution {
    public int findDuplicate(int[] nums) {
        Arrays.sort(nums);
        int x = nums.length;
        int s = 0;
        int[] result = new int[x - 1];
        for(int i = 0; i < x - 1; i++){
            if(nums[i] == nums[i + 1])
                return nums[i];
        } 
        return 1;
    }
}