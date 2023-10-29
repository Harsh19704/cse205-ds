class Solution {
    public int maxProduct(int[] nums) {
         PriorityQueue<Integer> pq = new PriorityQueue<Integer>(Collections.reverseOrder());

        
        for(int i = 0; i < nums.length; i++)
        {
            pq.add(nums[i]);
        }

    
        int first = pq.poll();
        int second = pq.poll();

        return (first - 1) * (second - 1);
    }
}