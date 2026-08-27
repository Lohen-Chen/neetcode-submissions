class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<Character, Integer> sletters = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!sletters.containsKey(s.charAt(i))){
                sletters.put(s.charAt(i), 1);
            } else {
                sletters.put(s.charAt(i), sletters.get(s.charAt(i)) + 1);
            }
        }
        HashMap<Character, Integer> tletters = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            if(!tletters.containsKey(t.charAt(i))){
                tletters.put(t.charAt(i), 1);
            } else {
                tletters.put(t.charAt(i), tletters.get(t.charAt(i)) + 1);
            }
        }
        
        return sletters.equals(tletters);
    }
}
