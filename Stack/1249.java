class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack = new Stack<>();
        for (int i = s.length() - 1; i >= 0; i--) {
            
            // if we encounter a ')', we store its index 
            // OR if we encounter a '(' which is not matched 
            // with the recent bracket, we store its index
            if (s.charAt(i) == ')' || (s.charAt(i) == '(' && (stack.isEmpty() || s.charAt(stack.peek()) == '(')))
                stack.push(i);
            
            // if we encounter a '(' which is matched with the 
            // recent bracket, we pop it
            else if (s.charAt(i) == '(' && s.charAt(stack.peek()) == ')')
                stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (!stack.isEmpty() && stack.peek() == i) stack.pop();
            else sb.append(s.charAt(i));
        }
        return sb.toString();
    }
}
