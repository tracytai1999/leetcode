class Solution {
    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) return 0;
        long sum = 0;
        return dfs(root, targetSum, sum) + pathSum(root.left, targetSum) + pathSum(root.right, targetSum);
        
        
    }
    private int dfs(TreeNode root, int targetSum, long sum) {
        int res = 0;
        if (root == null) return 0;
        sum += root.val;
        if (sum == targetSum) res++;
        res += dfs(root.left, targetSum, sum);
        res += dfs(root.right, targetSum, sum);
        
        return res;
    }
}