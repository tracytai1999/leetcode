class Solution {
    public long minimumHealth(int[] damage, int armor) {
        int max = 0;
        long health = 1;
        for (int i = 0; i < damage.length; i++) {
            health = health + damage[i];
            max = Math.max(max, damage[i]);
        }
        health = health - Math.min(max, armor);
        return health;
    }
}