class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>();
        List<Integer> ans = new ArrayList<>();

        // O(n)
        for (int n : nums) {
            ans.add(n);
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        // O(n * logn)
        Collections.sort(ans, (a, b) -> {   
            return map.get(a) == map.get(b) ? b - a : map.get(a) - map.get(b);
        });

        return ans.stream().mapToInt(i -> i).toArray(); // O(n)
    }
}

