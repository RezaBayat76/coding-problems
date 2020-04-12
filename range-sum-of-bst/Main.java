public class Main {

    public static void main(String[] args) {
        // Take tree input
        // Take left and right value
        // Call rangeSumBST(root, left, right)
    }

    public static int rangeSumBST(TreeNode root, int left, int right) {
        if (root == null) {
            return 0;
        }

        if (root.value >= left && root.value <= right) {
            return root.value + rangeSumBST(root.left, left, right) + rangeSumBST(root.right, left, right);
        }

        return rangeSumBST(root.left, left, right) + rangeSumBST(root.right, left, right);
    }
}

class TreeNode {
    int value;
    TreeNode left;
    TreeNode right;

    public TreeNode(int value) {
        this.value = value;
    }
}


