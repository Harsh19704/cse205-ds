class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = {1,-1};
        for(int i = 0; i<nums.length;i++){
            int current = Math.abs(nums[i])-1;
            if(nums[current]<0)
                ans[0] = current + 1;
            else
                nums[current] = nums[current] * -1;
        }
        for(int i = 0; i<nums.length;i++){
            if(nums[i]>0)
                ans[1] = i+1;
        }
        return ans;
    }
}