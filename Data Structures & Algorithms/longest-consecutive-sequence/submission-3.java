class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int best = 0;
        for(int num : nums){
            if(!set.contains(num - 1)){
                int len = 1;
                int cur = num; //current number
                while(set.contains(cur+1)){
                    cur++;
                    len++;
                }
                best = Math.max(len, best);
            }
        }
        return best;
    }
}
