class Solution {
    public int largestInteger(int num) {
        PriorityQueue<Integer> oddpq = new PriorityQueue<>();
        PriorityQueue<Integer> evenpq = new PriorityQueue<>();
        int nums = num;
        while(num>0){
            int cur = num%10;
            if(cur%2==1){
                oddpq.add(cur);
            }else{
                evenpq.add(cur);
            }
            num /= 10;
        }
        StringBuilder sb = new StringBuilder();
        num = nums;
        while(num>0){
            int cur = num%10;
            if(cur%2==1)
                sb.insert(0, oddpq.poll());
            else
                sb.insert(0, evenpq.poll());
            num /= 10;
        }
        return Integer.parseInt(sb.toString());
    }
}