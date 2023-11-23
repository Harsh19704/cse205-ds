class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        
        for(int num : arr){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        
        List<Integer> freq = new ArrayList<>(map.values());
        Collections.sort(freq,Collections.reverseOrder());
        
        int i = 0;
        int count = 0;
        int totalLength = arr.length;
        
        while( totalLength > arr.length/2 ){
            totalLength-=freq.get(i);
            count++;
            i++;
        }
        
        return count;
    }
}