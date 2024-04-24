class Solution {
    public String convertToBase7(int num) {
        if(num == 0)
            return "0";
        StringBuilder result = new StringBuilder();
        int s = 0;
        if(num < 0){
            num = -num;
            s++;
        }
        while(num > 0){
            result.append(num % 7);
            num /= 7;
        }
        if(s == 1){
            result.append('-');
        }
        return result.reverse().toString();
    }
}