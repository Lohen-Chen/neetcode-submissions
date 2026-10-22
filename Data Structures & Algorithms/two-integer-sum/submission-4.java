
class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> values = new HashMap<>();
        // key: number, value: index
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(values.containsKey(complement)){
                return new int[]{values.get(complement), i};
            }
            values.put(nums[i], i);
        }
        return new int[0];
    }
}
