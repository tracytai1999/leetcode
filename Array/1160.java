class Solution {
     public int countCharacters(String[] words, String chars) {
        int[] cnt = new int[26];
        for(char ch:chars.toCharArray()) cnt[ch-'a'] ++;
        int res = 0;
        for(String w:words){
            boolean good = true;
            char[] chs = w.toCharArray();
            int[] tmp = cnt.clone();
            for(char ch: chs){
                tmp[ch-'a'] --;
                if(tmp[ch-'a']<0){
                    good = false;
                    break;
                }
            }
            if(good) res += w.length();
        }
        return res;
    }
}