
class Solution {

    public int lowRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int store = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                store = mid;
                e = mid - 1; // Search left
            } 
            else if (nums[mid] > target) {
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return store;
    }

    public int highRange(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        int store = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            if (nums[mid] == target) {
                store = mid;
                s = mid + 1; // Search right
            } 
            else if (nums[mid] > target) {
                e = mid - 1;
            } 
            else {
                s = mid + 1;
            }
        }

        return store;
    }

    public int[] searchRange(int[] nums, int target) {
        int first = lowRange(nums, target);
        int last = highRange(nums, target);

        return new int[]{first, last};
    }
}
