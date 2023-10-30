class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int x = jewels.length();
        int y = stones.length();
        int s = 0;
        for(int i = 0; i < x; i++){
            for(int j = 0; j < y; j++){
                if(jewels.charAt(i) == stones.charAt(j))
                    s++;
            }
        }
        return s;
    }
}