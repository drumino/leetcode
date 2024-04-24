class Solution {
    public String reverseVowels(String s) {
        StringBuilder result = new StringBuilder();
        int i = s.length() - 1;
        for(char c : s.toCharArray()){
            if(isVowel(c)){
                while(!isVowel(s.charAt(i))){
                    i--;
                }
                result.append(s.charAt(i));
                i--;
            }
            else{
                result.append(c);
            }
        }
        return result.toString();
    }
        private boolean isVowel(char c) {
        c = Character.toLowerCase(c);
        return c == 'a' || c == 'e' || c == 'u' || c == 'o' || c == 'i';
        }
}