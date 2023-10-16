class Solution {
    public int findNonMinOrMax(int[] nums) {
     if(nums.length<3){
     return -1;
     }
     Arrays.sort(nums);
     return nums[1];
    }}

        // for(int i = 0; i<nums.length-1;i++){
        //     for(int j = 0; j<nums.length-1-i;j++){
        //         if(nums[j] > nums[j+1]){
        //             int c = nums[j];
        //             nums[j] = nums[j+1];
        //             nums[j+1] = c;
        //         }
        //     }
        // }
        