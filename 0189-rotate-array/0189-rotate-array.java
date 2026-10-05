class Solution {
    public void rotate(int[] nums, int k) {
        int l = nums.length;
        int[] result = new int[l];
        for (int i = 0; i < l; i++) {
            result[(k + i) % l] = nums[i];
        }
        for (int j = 0; j < result.length; j++) {
            nums[j] = result[j];
        }
    }
}

/*    for(int j =0;j<nums.length;j++) {
        for(int i =1;i<nums.length;i++) {
            int temp =nums[i];
            nums[i]=nums[i-1];
       //     nums[i-1]=temp;
       
        }
        nums[nums.length-1] = nums[i-1];
        if (k==j) return;
    }
}
}   */