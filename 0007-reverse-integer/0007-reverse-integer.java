class Solution {
    public int reverse(int x) {
        int n = 0;
      while(x!=0){
        int ld = x%10;
        //positive overflow
        if((n>Integer.MAX_VALUE/10)||(n==Integer.MAX_VALUE/10 && ld>7)){
            return 0;
        }
        //negative overflow
        if((n<Integer.MIN_VALUE/10)||(n==Integer.MIN_VALUE/10 && ld<-8)){
            return 0;
        }
        n=n*10+ld;
        x=x/10;
      }
      return n;  
    }
}