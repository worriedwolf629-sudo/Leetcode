class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0;
        int max = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (sum >=0) {

                max = Math.max(sum, max);
            } else if (sum < 0) {

                max = Math.max(sum, max);
                sum = 0;
            }
        }
        return max;
    }
}