class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs == null || strs.length == 0)
            return new ArrayList<>();

        HashMap<String, List<String>> canonToStrings = new HashMap<>();

        for (String word : strs) {
            char[] letters = word.toCharArray();
            Arrays.sort(letters);
            String canon = new String(letters);

            List<String> canonWords = canonToStrings.getOrDefault(canon, new ArrayList<>());
            canonWords.add(word);
            canonToStrings.put(canon, canonWords);
        }

        return new ArrayList<>(canonToStrings.values());
    }
}