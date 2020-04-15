import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // Take a tree
        // Take k to to find kth smallest
        // Call kthSmallest(root, k)
    }

    public int kthSmallest(TreeNode root, int k) {
        return getSorted(root, new ArrayList<Integer>()).get(k - 1);
    }

    public static List<Integer> getSorted(TreeNode root, List<Integer> sorted) {
        if (root == null) {
            return sorted;
        }

        getSorted(root.left, sorted);
        sorted.add(root.val);
        getSorted(root.right, sorted);

        return sorted;
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
