//using count and then iterate
class Solution {
    public ListNode middleNode(ListNode head) {

        ListNode temp=head;
        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }

        int mid=count/2;
        temp=head;
        while(mid--!=0){
            temp=temp.next;
        }
        return temp;

        
    }
}

//using fast and slow pointer
 ListNode fast=head;
        ListNode slow=head;
        while(fast!=null && fast.next!=null){
           fast=fast.next.next;
           slow=slow.next; 
        }
        return slow;
    }
