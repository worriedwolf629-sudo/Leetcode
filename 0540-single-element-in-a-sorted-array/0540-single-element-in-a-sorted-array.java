
class Solution {
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
//always odd num of elements but m can be odd and even 
/*The key is to always make m even. Then compare nums[m] with nums[m+1].
The logic
- If they are equal → the pair is intact. The single element must be on the right.
- If they are NOT equal → the pair pattern has broken. The single element is on the left, or m itself. */ 
        while (s < e) {
            int m = s + (e - s) / 2;

            if (m % 2 != 0) {
                m--;
            }

            if (nums[m] == nums[m + 1]) {
                s = m + 2;
            } else {
                e = m;
            }
        }

        return nums[e];
    }
}
