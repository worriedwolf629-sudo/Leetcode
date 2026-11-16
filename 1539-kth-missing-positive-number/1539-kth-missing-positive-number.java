class Solution {
    public int findKthPositive(int arr[], int k) {
        //You're finding the first index m where the number of missing elements is at least k.

        // 20 30 40 70 110   5th  if k== 28 missing s=1 + missing = 29 ans !!
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            int missing = arr[m] - (m + 1);
            if (missing >= k) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return s + k;
    }
}
