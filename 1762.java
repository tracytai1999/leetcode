class Solution {
    public int[] findBuildings(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        stack.push(heights.length - 1);
        for(int i = heights.length - 2; i >= 0; i--) {
            if (heights[i] > heights[stack.peek()]){
                stack.push(i);
            }
        }
        int[] res = new int[stack.size()];
        for(int i = 0; i < stack.size(); i++) {
            res[i] = stack.get(i);
        }
        Arrays.sort(res);
        return res;
    }
}