class Solution {
   
    
    int solve(int n,int[] dp){
        if(n<0) return 0;
        if(n==0 || n==1)    return 1;
       
        if(dp[n]!=-1)
            return dp[n];
       int left=solve(n-1,dp);
       int  right=solve(n-2,dp);
        return dp[n]=left+right;
}
    public int climbStairs(int n) {
       int[] dp=new int[n+1];
       for(int i=0;i<n+1;i++){
           dp[i]=-1;
       }
       return solve(n,dp);

    }
}
