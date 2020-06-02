public class ListNode {
         int val;
         ListNode next;
         ListNode(int x) { val = x; }
     }
    
   class Solution {
       public void deleteNode(ListNode node) {
           if(node!=null && node.next!=null){
               ListNode temp= node.next;
               node.val=node.next.val;
               node.next=node.next.next;
               temp.next=null;
           }
           
           
       }
   }