class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int currentelement = 0;          // Bug 3 fix: store the VALUE, not an index

        for (int i = 0; i < nums.length; i++) {   // Bug 1 fix: include last element

            // Bug 2 fix: removed the nested while(count > 0) entirely.
            // Each element gets exactly one +1/-1 per pass — no looping needed.

            if (count == 0) {
                // Bug 4 fix: handle "reset candidate" FIRST, as its own branch.
                // This was the unreachable third else-if in your version.
                currentelement = nums[i];
                count = 1;
            } else if (nums[i] == currentelement) {
                count++;                 // same as candidate → vote up
            } else {
                count--;                 // different → cancel one vote
            }
        }

        return currentelement;           // Bug 5 fix: return the element, not count
    }
}