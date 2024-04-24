class Solution {
    public List<String> generateParenthesis(int n) {
         List<String> result = new ArrayList<>();
        if (n < 0)
            return result;
        helper(new StringBuilder(), 0, 0, n, result);
        return result;
    }
    private void helper(StringBuilder currentString, int openNum, int closedNum, int n, List<String> results) {
        if(openNum == n && closedNum == n){
            results.add(currentString.toString());
            return ;
        }
        if(openNum < n){
            currentString.append('(');
            helper(currentString, openNum + 1, closedNum, n, results);
            currentString.setLength(currentString.length() - 1);
        }
        if(openNum - closedNum > 0){
            currentString.append(')');
            helper(currentString, openNum, closedNum + 1, n, results);
            currentString.setLength(currentString.length() - 1);
        }
    }
}