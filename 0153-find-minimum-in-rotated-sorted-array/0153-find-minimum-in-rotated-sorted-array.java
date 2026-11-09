class Solution {
    public int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            min = Math.min(nums[m], min);
            if (nums[m] > nums[e]) { //  

                s = m + 1;
               
            } else { // 1 2 4 5 6 7 0
                e = m - 1;
  
            }

        }
        return min;
    }
}