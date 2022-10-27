class Solution {
    void recur(Node root,List<Integer> arr){
        
         arr.add(root.val);
         for(int i=0;i<root.children.size();i++)
           recur(root.children.get(i),arr);
        

    }
    public List<Integer> preorder(Node root) {
         List<Integer> arr=new ArrayList<>();
        if(root==null)
        return arr; 
        recur(root,arr);
        return arr;
    }
}
