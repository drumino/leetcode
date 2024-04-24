class Solution {
    public double myPow(double x, int n) {
        long p = (long) n;
        if(n == 0)
            return 1.0;
        if(n < 0)
            return 1.0 / binaryPow(x, -p);
        else{
            return binaryPow(x, p);
        }
    }
        private double binaryPow(double x, long p) {
        double result = 1.0;
        while (p > 0) {
            if (p % 2 == 0) {
                x = x * x;
                p /= 2;
            } else {
                result = result * x;
                p--;
            }
        }
        return result;
    }
}
