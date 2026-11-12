class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int s = 1;
        //s = 1, not 0, because a divisor cannot be zero.
        int e = 0;
        int mid = 0;
        for (int i = 0; i < nums.length; i++) {
            e = Math.max(e, nums[i]);
        }
        while (s < e) {
            mid = s + (e - s) / 2;
            int sum = 0;
            for (int j = 0; j < nums.length; j++) {
                sum += (nums[j] + mid - 1) / (mid);
            }
            if (sum > threshold) {
                s = mid + 1;
            } else {
                e = mid;
            }
        }
        return e;
    }
} //int ceil = (num + divisor - 1) / divisor;        