class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        // key: index; value: frequencies table
        for (String str : strs) {
            int[] freq = new int[26];
            for(int j = 0; j < str.length(); j++){
                freq[str.charAt(j) - 'a']++;
            }
            String key = Arrays.toString(freq);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(str);
        }
        return new ArrayList<>(map.values());
    }
}
