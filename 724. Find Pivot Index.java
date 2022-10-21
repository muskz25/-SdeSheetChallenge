//Using variable
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int pre=0;
        int suff=0;
        
        for(int i=0;i<n;i++){
           suff=suff+nums[i];
        }

         for(int i=0;i<n;i++){
             suff-=nums[i];
             if(suff==pre)
             return i;
             pre+=nums[i];
         }
      return -1;
    }
}

//using 2 arrays
class Solution {
    public int pivotIndex(int[] nums) {
        int n=nums.length;
        int[] pre= new int[n];
        int[] suff=new int[n];
        pre[0]=nums[0];
        int ans=-1;
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+nums[i];
        }
        suff[n-1]=nums[n-1];
         for(int i=n-2;i>=0;i--){
            suff[i]=suff[i+1]+nums[i];
        }

        for(int i=0;i<n;i++){
            if(pre[i]==suff[i]){
            ans=i;
            break;
            }
        }

        return ans;
    }
}
