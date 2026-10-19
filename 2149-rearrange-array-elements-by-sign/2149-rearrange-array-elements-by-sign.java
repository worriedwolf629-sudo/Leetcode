class Solution {
    public int[] rearrangeArray(int[] nums) {
        int[] arr1 = new int[nums.length / 2];
        int[] arr2 = new int[nums.length / 2];
        int k = 0, m = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                arr1[k] = nums[i];
                k++;
            } else {
                arr2[m] = nums[i];
                m++;
            }
        }
        for (int j = 0; j < arr1.length; j++) {
            nums[2 * j] = arr1[j];
            nums[2 * j + 1] = arr2[j];
        }
        return nums;
    }
}