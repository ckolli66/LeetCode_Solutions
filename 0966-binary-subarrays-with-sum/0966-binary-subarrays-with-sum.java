class Solution {
    public int numSubarraysWithSum(int[] nums, int goal) {
      return numSubarrays(nums,goal)-numSubarrays(nums,goal-1);
    }
    public int numSubarrays(int[] nums, int goal) {
        if(goal<0)
        {
            return 0;
        }
        int left=0,right=0;
        int sum=0,count=0;
        while(right<nums.length)
        {
            sum+=nums[right];
            while(sum>goal)
            {
                sum-=nums[left];
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
    }
}