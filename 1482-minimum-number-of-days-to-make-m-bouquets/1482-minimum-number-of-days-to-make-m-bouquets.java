
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {

        // Impossible to make m bouquets
        if ((long) m * k > bloomDay.length) {
            return -1;
        }

        int s = Integer.MAX_VALUE;
        int e = Integer.MIN_VALUE;

        // Find the minimum and maximum blooming days
        for (int day : bloomDay) {
            s = Math.min(s, day);
            e = Math.max(e, day);
        }

        int ans = -1;

        while (s <= e) {
            int mid = s + (e - s) / 2;

            int counter = 0;
            int noOfBouquets = 0;

            for (int i = 0; i < bloomDay.length; i++) {

                if (bloomDay[i] <= mid) {
                    counter++;

                    if (counter == k) {
                        noOfBouquets++;
                        counter = 0;
                    }
                } else {
                    counter = 0;
                }
            }

            if (noOfBouquets >= m) {
                ans = mid;
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return ans;
    }
}

