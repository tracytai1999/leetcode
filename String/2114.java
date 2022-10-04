class Solution {
    public int mostWordsFound(String[] sentences) {
        int max_count = 0;
        for (int i = 0; i < sentences.length; i++) {
            if(length(sentences[i]) > max_count) {
                max_count = length(sentences[i]);
            }
        }
        return max_count;
    }
    
    public int length(String s){
        String str[]  =s.split(" ");
        return str.length;
    }
}