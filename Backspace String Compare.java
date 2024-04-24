class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!stack1.isEmpty())
                    stack1.pop();
            } else {
                stack1.push(c);
            }
        }
        
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!stack2.isEmpty())
                    stack2.pop();
            } else {
                stack2.push(c);
            }
        }
        
        if (stack1.size() != stack2.size())
            return false;

        while (!stack1.isEmpty()) {
            if (stack1.peek() != stack2.peek())
                return false;
            stack1.pop();
            stack2.pop();
        }

        return true;
    }
}