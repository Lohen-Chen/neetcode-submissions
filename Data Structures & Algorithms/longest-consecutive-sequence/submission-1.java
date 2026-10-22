class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;                          // change 1: empty array
        Arrays.sort(nums);
        Map<Integer, Integer> cons = new HashMap<>();
        cons.put(nums[0] + 1, 1);
        for(int num : nums){
            cons.put(num + 1, cons.getOrDefault(num, 0) + 1);
        } 
        // change 2: flip the comparator so the LARGEST length is at the front
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> Integer.compare(cons.get(b), cons.get(a)));
        for(int num : cons.keySet()){
            heap.offer(num);
        }
        return cons.get(heap.poll());                            // change 3: return the length, not the key
    }
}