class Solution {
    public String mergeAlternately(String word1, String word2) {
        int length = Math.min(word1.length(), word2.length());
        StringBuilder res = new StringBuilder();
        int one = 1;
        int two = 0;
        if (length == 0) {
            return word1 + word2;
        }
        for (int i = 0; i < length * 2; i++) {
            if (i == 0) {
                res.append(word1.charAt(i));
            }else if (i % 2 == 0) {
                res.append(word1.charAt(one));
                one++;
            }else if (i % 2 == 1) {
                res.append(word2.charAt(two));
                two++;
            }
        }
        if (word1.length() > word2.length()){
            for (int i = length * 2; i < word1.length() + word2.length(); i++) {
                res.append(word1.charAt(one));
                one++;
            }
        }
        if (word1.length() < word2.length()){
            for (int i = length * 2; i < word1.length() + word2.length(); i++) {
                res.append(word2.charAt(one));
                one++;
            }
        }
        
        return res.toString();
    }
}

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < Math.max(m, n); i++) {
            if (i < m) {
                result.append(word1.charAt(i));
            }
            if (i < n) {
                result.append(word2.charAt(i));
            }
        }

        return result.toString();
    }
}