//Recursive
class Solution {
    int climb(int[]cost,int n){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        int ans=cost[n]+Math.min(climb(cost,n-1),climb(cost,n-2));
        return ans;
    }

    public int minCostClimbingStairs(int[] cost) {
        int n=cost.length;
      int startZero=climb(cost,n-1);  
       int startOne=climb(cost,n-2); 
       return Math.min(startZero,startOne); 
    }
}

//Memo
int climb(int[]cost,int[] dp,int n){
        if(n==0) return cost[0];
        if(n==1) return cost[1];
        if(dp[n]!=-1)
        return dp[n];
        dp[n]=cost[n]+Math.min(climb(cost,dp,n-1),climb(cost,dp,n-2));
        return dp[n];
    }

    public int minCostClimbingStairs(int[] cost) {
    int n=cost.length;
       int[] dp=new int[n+1];
       for(int i=0;i<n+1;i++){
           dp[i]=-1;
       }
       return Math.min(climb(cost,dp,n-1) ,climb(cost,dp,n-2));
    }
}
