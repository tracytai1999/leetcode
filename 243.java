class Solution {
     public int shortestDistance(String[] words, String word1, String word2) {
        if ((words == null) || (words.length == 0)) 
            return -1;
        
        int index_w1=-1, index_w2=-1;
        int shortestDistance = Integer.MAX_VALUE;
        for (int i=0; i<words.length; i++) {
            if (words[i].equals(word1))
                index_w1 = i;            
            if (words[i].equals(word2))
                index_w2 = i;
            
            // We found a new path between w1 and w2
            if ((index_w1!=-1) && (index_w2!=-1)) {
                shortestDistance = Math.min(shortestDistance, Math.abs(index_w1-index_w2));
            }            
        }
        
        return shortestDistance == Integer.MAX_VALUE? -1 : shortestDistance;
    }
}