import java.util.*;

class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) return result;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            TreeNode rightMost = null;

            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                rightMost = node; // last node in this level

                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }

            // add the rightmost node of this level
            result.add(rightMost.val);
        }

        return result;
    }
}
