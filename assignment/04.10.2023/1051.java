class Solution {
    public int heightChecker(int[] heights) {
       int expected[] = new int[heights.length];
       for(int i = 0; i<heights.length; i++){
            expected[i] = heights[i];
       }
       Arrays.sort(heights);
       int ans = 0;

       for(int i = 0; i<heights.length; i++){
            if(expected[i] != heights[i]){
                ans++;
            }
       }
       return ans;
    }}