public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode temp=head;
        HashMap<ListNode,Integer> map=new HashMap<>();
        int i=0;
        while(temp!=null){
            if(map.containsKey(temp))
              return temp;
            else{
                map.put(temp,i++);
                temp=temp.next;
            }
            
        }
      return null;  
    }
}
