class Solution {
    public boolean isValidBST(TreeNode root) {
        return checker(root, null, null);
    }
    
    public boolean checker(TreeNode root, Integer low, Integer high){
        if (root == null ) return true; 
        if ((low != null && root.val <= low) || (high != null && root.val >= high)) {
            return false;
        }
        return checker(root.left,  low, root.val) && checker(root.right, root.val, high);
    }
}