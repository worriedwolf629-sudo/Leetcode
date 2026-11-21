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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        ListNode dummy = new ListNode(0);
        ListNode ans = dummy;
        int carry = 0;
        int inans = 0;
        while (t1 != null && t2 != null) {
            /*      if (t1.val + t2.val < 10) {
                ans.next = new ListNode(t1.val + t2.val+carry);
                ans = ans.next;
            
                t1 = t1.next;
                t2 = t2.next;
            } else { //18  ans =8 carry 1   */
            inans = (t1.val + t2.val + carry) % 10;
            ans.next = new ListNode(inans);
            ans = ans.next;
            carry = (t1.val + t2.val+carry) / 10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while (t1 == null && t2 != null)

        {
            inans = (t2.val + carry) % 10;
            ans.next = new ListNode(inans);
            ans = ans.next;
            carry = (t2.val + carry) / 10;
            t2 = t2.next;
        }
        while (t1 != null && t2 == null) {
            inans = (t1.val + carry) % 10;
            ans.next = new ListNode(inans);
            ans = ans.next;
            carry = (t1.val + carry) / 10;
            t1 = t1.next;
        }
        if (carry > 0) {
            ans.next = new ListNode(carry);
        }
        return dummy.next;
    }
} // 9 9 9 9 9 9 9
  // 9 9 9 9
  // 8 9 9 9 0 0 0 1