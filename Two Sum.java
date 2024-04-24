class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums == null || nums.length < 2)
            return null;

        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int need = target - nums[i];
            if (mp.containsKey(need)) {
                int[] result = {i, mp.get(need)};
                return result;
            }
            mp.put(nums[i], i);
        }

        return null;
    }
}