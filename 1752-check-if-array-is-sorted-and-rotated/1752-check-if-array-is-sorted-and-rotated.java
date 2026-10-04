class Solution {
    public boolean check(int[] nums) {
        int drop =0;
        int n =nums.length;
        for(int i = 0;i<n;i++) {
            if(nums[i]>nums[(i+1) % n] ) drop++; 
        }

        return drop<=1;

    }
}




















   /*     int[] newarr =Arrays.sort(nums);

        if (nums ==newarr) {
            return true;
        }
        else if {
        for (int j = 0; j< nums.length; j++)
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            nums[i]=nums[i+1];
            nums[i+1]=temp;

            if (int temp=nums[nums.length-1]) {
                int k = nums[0];
                nums[0]=nums[nums.length-1];
                nums[nums.length-1]=k;
            }
           

        }
    }
    return true;
    } 
}
*/