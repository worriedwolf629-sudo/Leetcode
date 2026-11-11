class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        //koko can only eat from ONE pile per hour.
        //Koko likes to eat slowly but still wants to finish eating all the bananas before the guards returr
        int s = 1;
        int e = 0;

for (int i = 0; i < piles.length; i++) {
    e = Math.max(e, piles[i]);
}
        int ans = 0;
        // m = eating speed   
        //k =total hours required at that speed. 
        while (s <= e) {
            int m = s + (e - s) / 2;
            long k = 0;
            for (int i = 0; i < piles.length; i++) {
                k += (piles[i] + (long)m - 1) / m;
            }
            if (k > h) {
                s = m + 1;
            } else {
                e = m - 1;
                ans = m;
            }

        }

        return ans;
    }
}