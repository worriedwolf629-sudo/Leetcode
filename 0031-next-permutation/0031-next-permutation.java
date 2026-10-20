class Solution {
    public void nextPermutation(int[] nums) {
        int k = -1, t = 0;
        if (nums.length < 2) return;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                k = i;
                t = i + 1;
                break;
            }
        }
        if (k != -1) {
        for (int j = nums.length - 1; j > k; j--) {
            if (nums[k] < nums[j]) {
                int temp = nums[k];
                nums[k] = nums[j];
                nums[j] = temp;
                break;
            }
        }
        }
        int left = t;
        int right = nums.length - 1;
        while (left < right) {
            int tempo = nums[left];
            nums[left] = nums[right];
            nums[right] = tempo;
            left++;
            right--;
        }

    }
}