/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ArrayList<Integer> inOrder (TreeNode root, ArrayList<Integer> set){
        if(root == null) return set;
        help(root.left, set);
        set.add(root.val);
        help(root.right, set);
        return set;
    }
    public int kthSmallest(TreeNode root, int k) {
          ArrayList<Integer> set = inOrder(root, new ArrayList<Integer>());
        return set.get(k-1);
    }
}
