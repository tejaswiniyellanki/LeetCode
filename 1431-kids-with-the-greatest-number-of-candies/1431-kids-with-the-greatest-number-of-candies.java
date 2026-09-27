class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> arr = new ArrayList<>();
        int n = candies.length;
        int max = candies[0];
        for(int i = 1;i<n;i++){
            if(candies[i]>max){
                max = candies[i];
            }
        }
        for(int j = 0;j<n;j++){
            if((candies[j]+extraCandies) >= max){
                arr.add(true);
            }
            else arr.add(false);
        }
        return arr;
    }
}