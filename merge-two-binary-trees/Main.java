
public class Main {

    public static void main(String[] args) {
        // Take the first tree
        // Take the second tree
        // Call mergeTrees(t1, t2)
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        TreeNode t = null;
        if (t1 != null && t2 != null) {
            t = new TreeNode(t1.val + t2.val);
            t.left = mergeTrees(t1.left, t2.left);
            t.right = mergeTrees(t1.right, t2.right);
        } else if (t1 != null) {
            t = new TreeNode(t1.val);
            t.left = mergeTrees(t1.left, null);
            t.right = mergeTrees(t1.right, null);
        } else if (t2 != null) {
            t = new TreeNode(t2.val);
            t.left = mergeTrees(null, t2.left);
            t.right = mergeTrees(null, t2.right);
        }

        return t;
    }

    class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int x) {
            val = x;
        }
    }
}
