class Solution {
    public int myAtoi(String str) {
        if (str == null || str.length() == 0)
            return 0;
        
        double result = 0.0;
        int sign = 1;

        boolean numberStarted = false;        
        
        for (char c : str.toCharArray()) {
            if (numberStarted && !Character.isDigit(c))
                break;
            
            if (c == '+') {
                sign = 1;
                numberStarted = true;
            } else if (c == '-') {
                sign = -1;
                numberStarted = true;
            } else if (Character.isDigit(c)) {
                result = result * 10 + c - '0';
                numberStarted = true;
            } else if (c != ' ') {
                return 0;
            }
        }
        
        result *= sign;
        if (result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if (result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int) result;
    }
}