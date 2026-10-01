class Solution {
    public int[] finalPrices(int[] prices) {
       int n = prices.length;
        int[] result = prices.clone();
        
        // Stack to store indices of items
        java.util.ArrayDeque<Integer> stack = new java.util.ArrayDeque<>();
        
        for (int i = 0; i < n; i++) {
            // Apply discount to previous items that are >= current item price
            while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
                int index = stack.pop();
                result[index] -= prices[i];
            }
            stack.push(i);
        }
        
        return result; 
    }
}