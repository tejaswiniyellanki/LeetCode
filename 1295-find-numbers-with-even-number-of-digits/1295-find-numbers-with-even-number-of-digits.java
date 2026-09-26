class Solution {
    public int findNumbers(int[] nums) {
        int n = nums.length;
        int cnt = 0;
        for(int i = 0;i<n;i++){
             int numofdigits = 0;
             int digit = nums[i];
        while(digit>0){
            digit = digit/10;
            numofdigits++;
            }
        if(numofdigits % 2 == 0){
            cnt++;
        }
        }
        return cnt;
    }
}