class Solution {
    public static void dfs(char[][] grid,int row,int col,int i,int j){
        if(i<0 || i>=row || j<0 || j>=col || grid[i][j]!='1')
        return;
         grid[i][j]='2';

         dfs(grid,row,col,i+1,j);
          dfs(grid,row,col,i-1,j);
           dfs(grid,row,col,i,j+1);
            dfs(grid,row,col,i,j-1);
    }
    public int numIslands(char[][] grid) {
        int n=grid.length;
        int m=grid[0].length;
        int count=0;
     for(int i=0;i<n;i++){
         for(int j=0;j<m;j++){
             if(grid[i][j]=='1'){
                 count++;
                 dfs(grid,n,m,i,j);
             }
         }
      } 
      return count;  
    }
}
