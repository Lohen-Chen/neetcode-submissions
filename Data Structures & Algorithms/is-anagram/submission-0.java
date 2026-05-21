class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        HashMap<String, Integer> sletters = new HashMap<>();
        for(int i = 0; i<s.length(); i++){
            if(!sletters.containsKey(s.substring(i,i+1))){
                sletters.put(s.substring(i,i+1), 1);
            } else {
                sletters.put(s.substring(i,i+1), sletters.get(s.substring(i,i+1)) + 1);
            }
        }
        HashMap<String, Integer> tletters = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            if(!tletters.containsKey(t.substring(i,i+1))){
                tletters.put(t.substring(i,i+1), 1);
            } else {
                tletters.put(t.substring(i,i+1), tletters.get(t.substring(i,i+1)) + 1);
            }
        }
        
        return sletters.equals(tletters);
    }
}
