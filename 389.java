class Solution {
    public char findTheDifference(String s, String t) {
        int sSum = 0;
        int tSum = t.charAt(t.length() - 1);
        for(int i = 0; i < s.length() ; i++){
            sSum += s.charAt(i);
            tSum += t.charAt(i);
        }
        return (char)(tSum - sSum);
    }
}