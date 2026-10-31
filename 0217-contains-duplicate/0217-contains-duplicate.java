class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> s = new HashSet<>();

        for (int ele : nums) {
            if (s.contains(ele)) {
                return true;
            } else {
                s.add(ele);
            }
        }
        return false;

    }
}

/*       int n = nums.length;
        int[] hash = new int[n + 1];

        for (int i = 0; i < n; i++) {
            hash[nums[i]] += 1;
        }
        for (int ele : hash) {
            if (ele > 1) {
                return true;
            }
        }

        return false;

    }
}*/