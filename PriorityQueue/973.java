class Solution {
    public int[][] kClosest(int[][] points, int K) {
        PriorityQueue<int[]> pq = new PriorityQueue<int[]>(K, (a, b) -> (b[0] * b[0] + b[1] * b[1]) - (a[0] * a[0] + a[1] * a[1]));
        
        for (int[] point : points) {
            pq.offer(point);
            if (pq.size() > K) {
                pq.remove();
            }
        }
        
        return pq.toArray(new int[K][2]);
    }
}