class Solution {
    public String licenseKeyFormatting(String S, int K) {
        StringBuilder builder = new StringBuilder();
        
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == '-')
              continue;
            if (builder.length() % (K + 1) == K)
                builder.append('-');
            builder.append(Character.toUpperCase(S.charAt(i)));
        }
        
        return builder.reverse().toString();
    }
}