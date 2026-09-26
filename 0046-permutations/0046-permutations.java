class Solution {
    public void getPermutation(int nums[],List<Integer>perm,int idx,List<List<Integer>>perms){
        //base case
        if(idx == nums.length){
            perms.add(new ArrayList(perm));
            return;
        }
        for(int i = 0;i<perm.size();i++){
            if(perm.get(i)==null){
                perm.set(i,nums[idx]);
                getPermutation(nums,perm,idx+1,perms);
                perm.set(i,null);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>>perms = new ArrayList<>();

        List<Integer>perm = new ArrayList<>();
        for(int i = 0;i<nums.length;i++){
            perm.add(null);
        }   

        getPermutation(nums,perm,0,perms);
        return perms;
    }
}