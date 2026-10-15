// Problem: Validate Stack Sequences
// URL: https://leetcode.com/problems/validate-stack-sequences/
// Language: java

class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int j = 0;

        for (int num : pushed) {
            stack.push(num);

            while (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop();
                j++;
            }
        }

        return stack.isEmpty();
    }
}