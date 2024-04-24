class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> results = new ArrayList<>();
        if (nums == null || nums.length == 0)
            return results;
        boolean[] usedNum = new boolean[nums.length];
        Helper(nums, usedNum, new LinkedList<Integer>(), results);
        return results;
    }
    private void Helper(int[] nums, boolean[] usedNum, List<Integer> currentPermutation, List<List<Integer>> results) {
        if (currentPermutation.size() == nums.length) {
            results.add(new ArrayList<Integer>(currentPermutation));
            return;
        }
        for(int i = 0; i < nums.length; i++){
            if (!usedNum[i]) {
                currentPermutation.add(nums[i]);
                usedNum[i] = true;
                Helper(nums, usedNum, currentPermutation, results);
                currentPermutation.remove(currentPermutation.size() - 1);
                usedNum[i] = false;
        }
        }
    }
}