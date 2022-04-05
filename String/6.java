class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1) return s;
        List<StringBuilder> list = new ArrayList<>();
        for(int i = 0; i < numRows; i++) list.add(new StringBuilder());
        boolean goingDown = false;
        int curRow = 0;
        for(int i = 0; i < s.length(); i++){
            char c= s.charAt(i);
            list.get(curRow).append(c);
            if(curRow == 0 || curRow == numRows - 1) goingDown = !goingDown;
            curRow += goingDown ? 1 : -1;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder sb: list){
            res.append(sb);
        }
        return res.toString();
    }
}