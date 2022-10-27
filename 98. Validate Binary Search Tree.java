class Solution {
   
    public boolean isValidBST(TreeNode root) {
        if(root==null) return true;

        return isValid(root.left,Long.MIN_VALUE,root.val) && 
        isValid(root.right,root.val,Long.MAX_VALUE);
        
    }
     public  boolean isValid(TreeNode root,long minValue,long maxValue){
        if(root==null)
        return true;
        System.out.println(root.val);
        if (root.val >= maxValue || root.val <= minValue) return false;
       
 return isValid(root.left, minValue, root.val) && isValid(root.right, root.val, maxValue);

    }
}
