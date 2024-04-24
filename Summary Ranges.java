class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new LinkedList<>();
        if (nums == null || nums.length == 0)
            return result;

        int l = 0, r = 0;
        while (l < nums.length) {
            r = l;
            while (r + 1 < nums.length && nums[r] + 1 == nums[r + 1])
                r++;
                
            if (l == r)
                result.add(Integer.toString(nums[l]));
            else
                result.add(Integer.toString(nums[l]) + "->" + Integer.toString(nums[r]));
            
            l = r + 1;
        }

        return result;
    }
}