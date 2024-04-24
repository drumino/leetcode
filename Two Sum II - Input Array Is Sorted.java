class Solution {
    public int[] twoSum(int[] numbers, int target) {
        if (numbers == null || numbers.length < 2)
            return null;

        int r = numbers.length - 1;
        for (int l = 0; l < numbers.length; l++) {
            int need = target - numbers[l];
            while (r - 1 > l && numbers[r] > need)
                r--;
            if (l < r && numbers[l] + numbers[r] == target) {
                int[] answer = {l + 1, r + 1};
                return answer;
            }
        }

        return null;
    }
}