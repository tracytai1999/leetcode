class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        if (root == null) return res;
        List<Integer> path = new ArrayList<>();
        dfs(root, targetSum, path);
        return res;             
    }
    
    private void dfs(TreeNode root, int targetSum, List<Integer> path) {
        if (root == null) return;
        path.add(root.val);
        // targetSum -= root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == root.val) {
                res.add(new ArrayList<>(path));
            }
        }else {
            dfs(root.left, targetSum - root.val, path);
            dfs(root.right, targetSum - root.val, path);
        }
        path.remove(path.size() - 1);
        
    }
}