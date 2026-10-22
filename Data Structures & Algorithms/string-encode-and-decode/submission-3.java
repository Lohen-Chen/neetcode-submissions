class Solution {

    public String encode(List<String> strs) {
        StringBuilder enc = new StringBuilder();
        for(String str : strs){
            enc.append(str.length()).append("#").append(str);
        }
        return enc.toString();
    }

    public List<String> decode(String str) {
        int i = 0;
        List<String> res = new ArrayList<>();
        while(i<str.length()){
            int j = i;
            while(str.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(str.substring(i,j));
            res.add(str.substring(j+1,j+1+length));
            i=j+1+length;
        }
        return res;
    }
}
