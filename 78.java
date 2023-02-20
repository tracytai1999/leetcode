class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> output = new ArrayList();
    output.add(new ArrayList<Integer>());

    for (int num : nums) {
      List<List<Integer>> newSubsets = new ArrayList();
      for (List<Integer> curr : output) {
        newSubsets.add(new ArrayList<Integer>(curr){{add(num);}});
      }
      for (List<Integer> curr : newSubsets) {
        output.add(curr);
      }
    }
    return output;
  }
}

class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> res = new ArrayList<>();
    dfs(nums, 0, res, new ArrayList<>());
    return res;
  }

  private void dfs(int[] nums, int index, List<List<Integer>> res, List<Integer> list) {
      res.add(new ArrayList<>(list));
      for (int i = index; i < nums.length; i++) {
          list.add(nums[i]);
          dfs(nums, i + 1, res, list);
          list.remove(list.size() - 1);
      }
  }
}