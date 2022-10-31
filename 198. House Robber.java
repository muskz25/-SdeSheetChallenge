//recursive
class Solution {
   
    int rob(int[]nums,int n){
         if(n==0) return nums[n];
         if(n<0) return 0;
       
        return Math.max(rob(nums,n-1),nums[n]+rob(nums,n-2));
    }

    public int rob(int[] nums) {
        int n=nums.length;
       return rob(nums,n-1); 
     
    }
}

//memo
int[] memo;
public int rob(int[] nums) {
    memo = new int[nums.length + 1];
    Arrays.fill(memo, -1);
    return rob(nums, nums.length - 1);
}

private int rob(int[] nums, int i) {
    if (i < 0) {
        return 0;
    }
    if (memo[i] >= 0) {
        return memo[i];
    }
    int result = Math.max(rob(nums, i - 2) + nums[i], rob(nums, i - 1));
    memo[i] = result;
    return result;
}
