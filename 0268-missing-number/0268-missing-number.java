class Solution {
    public int missingNumber(int[] nums) {
        int k = nums.length;
        int sum = 0;
        int sum2 = 0;
        for (int j = 0; j <= k; j++) {
            sum = sum + j;

        }
        for (int j = 0; j < k; j++) {
            sum2 = sum2 + nums[j];
        }
        int num = sum - sum2;

        return num;
    }
}