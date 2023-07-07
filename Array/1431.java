class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int highest = 0;
        for (int i = 0; i < candies.length; i++) {
            highest = Math.max(highest, candies[i]);
        }
        List<Boolean> res = new ArrayList<Boolean>();
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] + extraCandies >= highest) {
                res.add(true);
            }else {
                res.add(false);
            }
        }
        return res;
    }
}