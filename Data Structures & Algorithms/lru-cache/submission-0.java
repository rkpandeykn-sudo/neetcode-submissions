class LRUCache {
    int capacity;
    List<int[]> cache;

    public LRUCache(int capacity) {
        this.capacity = capacity;
        this.cache = new ArrayList<>();
    }

    public int get(int key) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
                int[] entry = cache.remove(i);
                cache.add(entry);

                return entry[1];
            }
        }
        return -1;
    }

    public void put(int key, int value) {
        for (int i = 0; i < cache.size(); i++) {
            if (cache.get(i)[0] == key) {
                cache.remove(i);
                cache.add(new int[] {key, value});
                return;
            }
        }

        if (cache.size() == capacity) {
            cache.remove(0);
        }
        cache.add(new int[] {key, value});
    }
}
