class Solution {
    private int getBit(int n, int x) {
        return (n & (1 << x)) > 0 ? 1 : 0;
    }
    public int hammingDistance(int x, int y) {
        int distance = 0;
        
        for (int i = 0; i < 31; i++) 
            if (getBit(x, i) != getBit(y, i))
                distance++;
  
        return distance;
    }
  }