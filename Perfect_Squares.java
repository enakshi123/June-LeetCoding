class Solution {
    public int numSquares(int n) {
        int memo[]=new int[n+1]; //incusive of zero as well
        return recursive(n,memo);
        
    }
    int recursive(int n,int []memo)
    {
        if(n<0)
            return Integer.MAX_VALUE; //base case
        if(n==0)
            return 0;
        if(memo[n]>0) return memo[n]; //if value already visited then reuse it only no need to find min
        int min=n; //no itself ie n
        for(int i=1;i*i<=n;i++)
        {
            min=Math.min(recursive(n-(i*i),memo),min);
        }
        memo[n]=min+1; //as base case is set 0
        return min+1;
        
    }
}