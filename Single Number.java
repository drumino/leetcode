class Solution {
    public int singleNumber(int[] nums) {
        int totalXor = 0;
        for (int num : nums)
            totalXor ^= num;
  
        return totalXor;
    }
  }