class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m + 1][n + 1]; //handle m,n as well +1
        for(int i = 0; i < m + 1; i++) Arrays.fill(dp[i], -1);
        return totalUniquePaths(m - 1, n - 1, dp); //last most col is m-1,n-1
    }
   
    public int totalUniquePaths(int m, int n, int[][] dp){
        if(m == 0 && n == 0) return 1; // base case
        if(m < 0 || n < 0) return 0;
        if(dp[m][n] != -1) return dp[m][n];
       
        return dp[m][n] = totalUniquePaths(m - 1, n, dp) + totalUniquePaths(m, n - 1, dp);
        //m-1 second last row n last col
        //n-1 second last col in last row m
    }
        
    
}