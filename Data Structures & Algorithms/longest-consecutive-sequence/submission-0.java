class Solution {
    public int longestConsecutive(int[] nums) {
        //sort nums. make a hashmap such that we take the first number, store the consecutive integer as a key and value length of 1, go to the second number, check if it exists as a key value in that list, if it does, we add 1 to the length, if it doesn't, we add it as a key with a value of 1. put all the values in an array and then sort then return largest. 
        if (nums.length == 0) return 0;
        Arrays.sort(nums);
        Map<Integer, Integer> cons = new HashMap<>();
        int best = 0;
        for(int num : nums){
            int len = cons.getOrDefault(num, 0) + 1;
            cons.put(num + 1, len);
            best = Math.max(len, best);
        }
        return best;
    }
}
