class Solution {
public:
    int lengthOfLastWord(string s) {
    int x = s.length();
    int r = 0;
    for (int i = x - 1; i >= 0; i--){
        if (s[i] != ' ')
            r++;
        else if(r != 0)
            break;
    }
    return(r); 
    }
};