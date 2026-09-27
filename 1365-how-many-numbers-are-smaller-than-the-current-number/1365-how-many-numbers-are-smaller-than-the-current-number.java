class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length; 
        int[] arr = new int[n];     
        for(int i = 0;i<n;i++){
            int noofsmallelements = 0;
            for(int j = 0;j<n;j++){
            if(nums[i]>nums[j]){
                noofsmallelements++;
               arr[i] = noofsmallelements;
                }
            }
        }
        return arr;
    }
}