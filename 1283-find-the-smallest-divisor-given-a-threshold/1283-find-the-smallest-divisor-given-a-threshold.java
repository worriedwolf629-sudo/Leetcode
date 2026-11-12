
class Solution {
    public int smallestDivisor(int[] nums, int threshold) {

        int s = 1;
        int e = 0;

        // Find maximum element
        for (int i = 0; i < nums.length; i++) {
            e = Math.max(e, nums[i]);
        }

        while (s <= e) {

            int mid = s + (e - s) / 2;
            int sum = 0;

            // Calculate sum using mid as divisor
            for (int j = 0; j < nums.length; j++) {
                sum += (nums[j] + mid - 1) / mid;
            }

            if (sum > threshold) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;
    }
}
//int ceil = (num + divisor - 1) / divisor;        