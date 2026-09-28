class Solution {
    public int[] twoSum(int[] nums, int target) {
        int n = nums.length;
        for(int i=0;i<=n-1;i++) {
            for(int j=i+1;j<=n-1;j++) {
                if (nums[i]+nums[j] == target) {
                    return new int[]{i,j};
                }
        }
        }  return new int[]{};
    } 
  
} 
//The problem says you can't use the same element twice, not that the values must be different. Two different indices can have the same value.