class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> output = new ArrayList<>();
        dfs(root, output);
        return output;
        
    }
    public void dfs(TreeNode root,List output){
        if(root == null) return;
        dfs(root.left, output);
        dfs(root.right, output);
        output.add(root.val);
    }
}