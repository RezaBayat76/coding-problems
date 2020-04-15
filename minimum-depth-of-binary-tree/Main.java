
public class Main {

    public static void main(String[] args) {
        // Take a tree
        // Call minDepth(root)
    }

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int minDepth = -1;
        if (root.left != null) {
            minDepth = minDepth(root.left);
        }

        if (root.right != null) {
            int minDepthRight = minDepth(root.right);
            if (minDepth == -1 || minDepthRight < minDepth) {
                minDepth = minDepthRight;
            }
        }

        return 1 + minDepth;
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
