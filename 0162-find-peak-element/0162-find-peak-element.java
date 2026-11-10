class Solution {
    public int findPeakElement(int[] nums) {
        int s = 0;
        int e = nums.length - 1;
        int res = -1;
        if (nums.length == 1) {
            return 0;
        }
        while (s < e) {
            int m = s + (e - s) / 2;

            //move towards peak !! 
            if (nums[m] > nums[m + 1]) { // 1 2 6 7 6 7
                res = m;
                e = m;
            } else if (nums[m] < nums[m + 1]) {
                res = m + 1;
                s = m + 1;
            }

        }
        return res;
    }
}