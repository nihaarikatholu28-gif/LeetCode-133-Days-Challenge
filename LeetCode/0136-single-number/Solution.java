class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        int result = 0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            int freq = entry.getValue();
            int key = entry.getKey();
            if(freq == 1){
                result = key;
            }
        }
        return result;
    }
}