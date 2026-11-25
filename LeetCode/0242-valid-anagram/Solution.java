class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> smap = new HashMap<>();
        HashMap<Character,Integer> tmap = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(char ch1:s.toCharArray()){
            smap.put(ch1,smap.getOrDefault(ch1,0)+1);
        }
        for(char ch2:t.toCharArray()){
            tmap.put(ch2,tmap.getOrDefault(ch2,0)+1);
        }
        return smap.equals(tmap);
    }
}