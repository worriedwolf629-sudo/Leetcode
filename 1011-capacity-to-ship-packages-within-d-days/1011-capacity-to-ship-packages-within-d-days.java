class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int s = 0;
        for (int i = 0; i < weights.length; i++) {
            s = Math.max(s, weights[i]);
        }
        // s =Hint: The ship must be able to carry the heaviest individual package in a particular day.
        int e = 0;
        // Find maximum weight as sum if 1 day 
        for (int i = 0; i < weights.length; i++) {
            e += weights[i];
        }
        while (s < e) {
            int m = s + (e - s) / 2; //m = wt
            //condition
            int myday = 1;
            int wtforaday = 0;
            for (int i = 0; i < weights.length; i++) {
                if (m >= wtforaday + weights[i]) {
                    wtforaday += weights[i];
                } else {
                    myday++;
                    wtforaday = weights[i];
                }
            }
            //binary search
            if (days < myday) {
                s = m + 1;
            } else {
                e = m;
            }

        }
        return e;
    }
}