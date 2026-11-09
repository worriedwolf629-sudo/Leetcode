class Solution {
    public int search(int[] nums, int target) {
       int s =0;
        int e =nums.length-1;
       // int m = s +(e-s)/2;     
       while(s <= e) {
    int mid = s + (e-s)/2;

    if(nums[mid] == target) return mid;

    if(nums[s] <= nums[mid]) {   // 4 5 6 7 2
        // Left half is sorted
        if(target >= nums[s] && target < nums[mid]) {   /* target lies in left half */
            e=mid-1;
        } else {
            s=mid+1;
        }
    } else {
        // Right half is sorted
        if(target > nums[mid] && target <= nums[e]) {     /* target lies in right half */
             s=mid+1;
        } else {
             e=mid-1;
        }
    }
}
return -1;
    }
}
