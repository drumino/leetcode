class Solution {
    public int mySqrt(int x) {
        if(x == 0)
            return 0;
        if(x == 1)
            return 1;
        long l = 1;
        long r = x;
        long result = 1;
        while(l < r){
            long mid = (l + r + 1) / 2;
            if(mid * mid <= x)
                l = mid;
            else
                r = mid - 1;
            if(mid * mid <= x)
                result = mid;
        }
        return (int)result;
    }
}