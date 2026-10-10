class Solution {
    public int singleNumber(int[] nums) {
        int ele = 0;
        for (int x : nums) {
            ele = ele ^ x;
        }
        return ele;
    }
}