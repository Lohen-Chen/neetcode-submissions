class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer, Integer> targets = new HashMap<>();
        //key: target; value: indice
        for(int i = 0; i < numbers.length; i++){
            int t = target - numbers[i];
            if(targets.containsKey(t)){
                return new int[]{targets.get(t) + 1, i + 1};
            } else {
                targets.put(numbers[i],i);
            }
        }
        return new int[]{0,0};
    }
}
