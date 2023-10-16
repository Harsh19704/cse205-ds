class Solution {
    public void sortColors(int[] nums) {
       if (nums == null || nums.length <= 1) {
            return;
        }
        mergesort(nums,0,nums.length-1);
        
    }
public static void mergesort(int[] arr, int s, int e){
        if(s>=e){
            return;
        }
        int mid = s + (e-s)/2;
        mergesort(arr, s, mid);
        mergesort(arr, mid+1, e);
        merge(arr, s, mid, e);
    }
    public static void merge(int[] arr, int s, int mid, int e){
        int[] temp = new int[e - s +1];
        int i = s;
        int j = mid+1; 
        int k = 0;

        while (i<=mid && j<=e) {
            if (arr[i]<arr[j]) {
                temp[k] = arr[i];
                i++;
            }
            else{
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }
        while (j<=e) {
            temp[k++] = arr[j++];
        }

        for (k = 0, i=s; k < temp.length; k++,i++) {
            arr[i] = temp[k];
        }
    }
}