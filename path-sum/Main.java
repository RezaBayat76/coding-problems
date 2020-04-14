
public class Main {

    public static void main(String[] args) {
        // Take a tree
        // Call hasPathSum(root)
    }

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return (sum - root.val) == 0;
        }

        boolean result = false;
        if (root.left != null) {
            result = result || hasPathSum(root.left, sum - root.val);
        }

        if (root.right != null) {
            result = result || hasPathSum(root.right, sum - root.val);
        }

        return result;
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
