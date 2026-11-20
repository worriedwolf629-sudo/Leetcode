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
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {

        // Pass 1: Count nodes
        int count = 0;
        ListNode counter = head;

        while (counter != null) {
            count++;
            counter = counter.next;
        }

        // Dummy node handles head deletion
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Pass 2: Reach previous node
        ListNode current = dummy;

        for (int i = 0; i < count - n; i++) {
            current = current.next;
        }

        // Skip the target node
        current.next = current.next.next;

        return dummy.next;
    }
}