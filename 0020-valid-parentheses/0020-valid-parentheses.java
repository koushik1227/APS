class Solution {
    public boolean isValid(String s) {
    if (s.length() % 2 != 0) return false;
        
        Stack<Character> stack = new Stack<>();
        
        for (char c : s.toCharArray()) {
            // Push expected closing bracket onto stack when an opening bracket is found
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                // If closing bracket doesn't match top or stack is empty
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        
        // Valid if all open brackets have been properly closed
        return stack.isEmpty();    
    }
}