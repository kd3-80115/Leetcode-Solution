/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
           if(head==null)
            return false;
        ListNode slow=head;
        ListNode fast=head.next;
        do
        {
            if(fast==null || fast.next==null )
                return false;
            slow=slow.next;
            fast=fast.next.next;
        }while(slow!=fast);
        return true;
    }
}