class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> freqTable = new HashMap<>();
        //key: number; value: freq
        for (int num : nums) {
            freqTable.put(num, freqTable.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Integer.compare(freqTable.get(a), freqTable.get(b)));

        for(int num : freqTable.keySet()){
            heap.offer(num);
            if(heap.size() > k){
                heap.poll();
            }
        }

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = heap.poll();
        }
        return res;
    }
}
