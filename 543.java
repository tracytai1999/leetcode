class Solution {
    private int diameter = 0;
    
    public int diameterOfBinaryTree(TreeNode root) {
        longestPath(root);
        return diameter;
    }  
    private int longestPath(TreeNode node) {
        if (node == null) return 0;
        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);
        
        diameter = Math.max(diameter, leftPath + rightPath);
        
        return Math.max(leftPath, rightPath) + 1;
    }
}