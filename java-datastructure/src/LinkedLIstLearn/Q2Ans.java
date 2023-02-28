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

1. find middle
2. reverse the secondhalf
3. copmare the first and second half

class Solution {

    public ListNode reverse(ListNode head){
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
            
        }
        return prev;
    }

    public ListNode middleele(ListNode head){
        // here implementing hare and turtle concept

        ListNode hare = head;
        ListNode turtle = head;

        if(hare.next != null && hare.next.next != null){
            hare = hare.next.next;
            turtle = turtle.next;
        }

        return turtle;

    }

    public boolean isPalindrome(ListNode head) {

        // every code is here 

        if(head==null) return true;

        ListNode slow = head,fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode rev = reverseList(slow.next);

        ListNode curr = head;
        while(rev!=null){
            if(rev.val!=curr.val)  return false;
            rev = rev.next;
            curr = curr.next;
        }
        return true;
    }
    public ListNode reverseList(ListNode head){
        ListNode curr = head;
        ListNode prev = null;
        while(curr!=null){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

*/