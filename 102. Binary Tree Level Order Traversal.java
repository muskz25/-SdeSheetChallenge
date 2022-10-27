class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
     List<List<Integer>> arr=new ArrayList<List<Integer>>();
    
     if (root == null) return arr;  
     
     Queue<TreeNode> q=new LinkedList<>(); 
     q.add(root);
     while(!q.isEmpty()){
         int n=q.size();
         List<Integer> list=new ArrayList<Integer>();
         for(int i=0;i<n;i++){
         TreeNode node=q.peek();
         q.remove();
         list.add(node.val);
         if(node.left!=null){
             q.add(node.left);
         }
         if(node.right!=null){
             q.add(node.right);
         }
         }

         arr.add(list);

     }
     return arr;
    }
}
