class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            allSubsets.add(new LinkedList<Integer>());
            return allSubsets;
        }
        subsetsHelper(0, new LinkedList<Integer>(), nums, allSubsets);

        return allSubsets;
    }
    private void subsetsHelper(int index, List<Integer> currentSubset, final int[] nums, final List<List<Integer>> allSubsets) {
        if (index == nums.length) {
            allSubsets.add(new LinkedList<Integer>(currentSubset));
            return;
        }

        subsetsHelper(index + 1, currentSubset, nums, allSubsets);

        currentSubset.add(nums[index]);
        subsetsHelper(index + 1, currentSubset, nums, allSubsets);
        currentSubset.remove(currentSubset.size() - 1);
    }
}
