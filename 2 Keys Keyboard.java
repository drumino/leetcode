class Solution {
    public int minSteps(int n) {
        if(n == 1)
            return 0;

        int result = 0;
        int currentNum = n;
        for (int i = 2; i * i <= currentNum; i++) {
            if (currentNum % i == 0) {
                while (currentNum % i == 0) {
                    result += i;
                    currentNum /= i;
                }                
            }
        }
        if (currentNum > 1) {
            result += currentNum;
        }
        return result;
    }
}