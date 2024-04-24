class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null)
            return null;
        
        List<Integer> result = new ArrayList<>();
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int pointer = 0;
        for(int i = 0; i < nums1.length; i++){
            while(pointer + 1 < nums2.length && nums1[i] > nums2[pointer])
                pointer++;
            if(pointer < nums2.length && nums1[i] == nums2[pointer]){
                result.add(nums1[i]);
                pointer++;
            }
        }
        int[] resultArray = new int[result.size()];
        for (int i = 0; i < result.size(); i++)
            resultArray[i] = result.get(i);

        return resultArray;
    }
}