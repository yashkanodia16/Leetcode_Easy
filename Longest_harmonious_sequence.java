class Solution {
    public int findLHS(int[] nums) {  
       HashMap<Long,Integer> map = new HashMap<>();
       for(long num:nums){
           map.put(num,map.getOrDefault(num,0)+1);
       }
        int count =0;
        for(long key: map.keySet()){
            if(map.containsKey(key+1)){
                count = Math.max(count, map.get(key+1)+map.get(key));
            }
        }
       return count; 
    }
}