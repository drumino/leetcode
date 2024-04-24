class Solution {
    private int getBit(int n, int x) {
        return (n & (1 << x)) > 0 ? 1 : 0;
    }
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> allSubsets = new ArrayList<>();
        if (nums == null || nums.length == 0) {
            allSubsets.add(new LinkedList<Integer>());
            return allSubsets;
        }
        
        final int N = nums.length;
  
        for (int bitMask = 0; bitMask < (1 << N); bitMask++) {
            List<Integer> currentSubset = new ArrayList<>();
            for (int i = 0; i < N; i++)
                if (getBit(bitMask, i) == 1)
                    currentSubset.add(nums[i]);
            allSubsets.add(currentSubset);
        }
        
        return allSubsets;
    }
  }