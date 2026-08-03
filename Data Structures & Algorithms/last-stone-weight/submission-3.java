class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (int i : stones) {
            pq.add(-i);
        }

        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            if (b > a)
                pq.add(a - b);
        }

        pq.add(0);
        return Math.abs(pq.peek());
    }
}
