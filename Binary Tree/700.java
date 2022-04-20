class Solution {
    private TreeNode res = null;
    
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null) return null;
        if (root.val == val) {
            res = root;
            return res;
        }
        if (root.val > val) {
            searchBST(root.left, val);
        }
        if (root.val < val) {
            searchBST(root.right, val);
        }
        return res;
    }
}