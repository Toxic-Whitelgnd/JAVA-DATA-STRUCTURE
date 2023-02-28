/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/* 
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // for single node
        if(head.next == null){
            return null;
        }

        
        int size = 0;
        ListNode curr = head;
        while(curr != null){
            curr =curr.next;
            size++;
        }

        int indexofPrev = size-n; //5-2 = 3 

        if(n == size){
            return head.next;
        }

        ListNode prev = head;
        int i =1;
        while(i<indexofPrev){
                prev = prev.next;
                i++;
            
        }
        // 2 -> 3 -> 4 -> 5 / 3 -> 5
        // 3 directly connected to 5 by below condition
        prev.next = prev.next.next;
        return head;
    }
}
*/