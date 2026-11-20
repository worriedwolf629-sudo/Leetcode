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
        ListNode twojump = head;
        ListNode onejump = head;

        while (twojump != null && twojump.next != null) {

            twojump = twojump.next.next;
            onejump = onejump.next;
            if (onejump == twojump) {
                return true;
            }
        }

        return false;
    }
}