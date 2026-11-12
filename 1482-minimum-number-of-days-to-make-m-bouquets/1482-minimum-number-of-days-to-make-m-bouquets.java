
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        int s = 0;
        int e = 0;
        int ans = -1;
        if (bloomDay.length < m * k) {
            return -1;
        }
        for (int i = 0; i < bloomDay.length; i++) {
            e = Math.max(bloomDay[i], e);
        }
        while (s <= e) {
            int mid = s + (e - s) / 2;
            int counter = 0;
            int noofcounter = 0;
            for (int j = 0; j < bloomDay.length; j++) {
                if (mid >= bloomDay[j]) {
                    counter++;
                    if (counter == k) {
                        noofcounter++;
                        counter = 0;
                    }
                } else {
                    counter = 0;
                }
                //   if(noofcounter==m) {
                //      ans=mid;
                //  }
            }
            //bs
            if (noofcounter < m) {
                s = mid + 1;
            } else {
                ans = mid;
                e = mid - 1;
            }
        }
        return ans;
    }
}
