class Solution {
    public int countSubarrays(int[] nums) {
        int count=0;
        int left=0,right=left+2;
        while(right<nums.length)
        {
            if(2*(nums[left]+nums[right])==(nums[(left+right)/2]))
            {
                count++;
            }
            left++;
            right++;
        }
        return count;
    }
}