class Solution {
    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            int swap = 0;
            if (nums[mid] == 0) {
                swap = nums[mid];
                nums[mid] = nums[low];
                nums[low] = swap;
                low++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else {
                swap = nums[mid];
                nums[mid] = nums[high];
                nums[high] = swap;
                high--;
            }

        }
    }
}