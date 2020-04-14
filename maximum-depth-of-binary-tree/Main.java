
public class Main {

    public static void main(String[] args) {
        // Take the tree
        // Call maxDepth(root)
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxDepth = maxDepth(root.left);
        int rightMaxDepth = maxDepth(root.right);

        int maxSubTreeDepth = leftMaxDepth > rightMaxDepth ? leftMaxDepth : rightMaxDepth;

        return 1 + maxSubTreeDepth;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
