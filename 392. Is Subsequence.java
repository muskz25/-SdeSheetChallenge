// 392. Is Subsequence

//Two-pointer
		 public boolean isSubsequence(String s, String t) {
        int i=0;
        int j=0;
       while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }
            else{
                j++;
            }
        }
        return (i==s.length());
    }
}

//Recursive
public boolean subsequence(String s, String t,int n,int m) {
        System.out.println(n+""+m);
        if(n==0)
        return true;
        if(n <=0 || m<=0) return false;
        if(s.charAt(n-1)==t.charAt(m-1)){
            return subsequence(s,t,n-1,m-1);
        }
        else{
            return subsequence(s,t,n,m-1);
        }
    }
 public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
         if(s.length()==0) return true;
        return subsequence(s,t,n,m);
   }

//Dp Top Down
class Solution {
    public boolean isSubsequence(String s, String t) {
        int n=s.length();
        int m=t.length();
        int[][] dp=new int[n+1][m+1];
       for(int i = 1;i < n+1; i++){
           for(int j = 1; j <= m;j++){
            if(s.charAt(i-1) == t.charAt(j-1))
                dp[i][j]=1 + dp[i-1][j-1];
            else
              dp[i][j]=Math.max(dp[i-1][j] , dp[i][j-1]);
        }
       }
        return dp[n][m] == n;
    }
}
