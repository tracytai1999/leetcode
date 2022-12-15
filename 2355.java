class Solution {
        public long maximumBooks(int[] books) {
        Deque<Integer> indexStack = new ArrayDeque<>();
        long currTake = 0, maxTake = 0;
        for (int i = 0; i < books.length; i++) {
            while (!indexStack.isEmpty() && books[i] - books[indexStack.peek()] < i - indexStack.peek()) { // Go back till you find a index that you can make 1,2,3,...,books[i]
                int peekIndex = indexStack.pop();
                currTake -= totalTake(books[peekIndex], indexStack.isEmpty() ? peekIndex + 1 : peekIndex - indexStack.peek()); // When you remove the index make sure you remove the take from current take as well
            }
            currTake += totalTake(books[i], indexStack.isEmpty() ? i + 1 : i - indexStack.peek()); // If stack is empty, we have i+1 index to reach books[i] from 0 to ith index
            indexStack.push(i); // Push the current index into the stack
            maxTake = Math.max(currTake, maxTake); // Keep track of the max take
        }
        return maxTake;
    }

    private long totalTake(long n, int indexDiff) { // 1,2,3,...,n=(n*(n+1))/2 also, we should remove the prefix if our index diff doesn't allow us to make it
        return (n * (n + 1)) / 2 - (n > indexDiff ? (n - indexDiff) * (n - indexDiff + 1) : 0) / 2;
    }
}