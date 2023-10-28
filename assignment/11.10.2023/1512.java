class Solution {
    public int numIdenticalPairs(int[] nums) {
     HashMap<Integer,Integer> map = new HashMap<>();
     int result = 0;
     for(int num : nums){
         if(map.containsKey(num)){
             result += map.get(num);
         }
         map.put(num,map.getOrDefault(num,0)+1);
     }
     return result;
    }
}