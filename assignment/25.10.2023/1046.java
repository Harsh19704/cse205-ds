lass Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int result = 0;
        for (int stone : stones) {
            maxHeap.offer(stone);
        }
        while (maxHeap.size() > 1) {
            int x = maxHeap.poll();
            int y = maxHeap.poll();
            if (x != y) {
                maxHeap.offer(Math.abs(y - x));
            }
        }
        if (maxHeap.isEmpty()) {
             result = 0;
        } else {
            result = maxHeap.peek();
}
        return result;
    }
}