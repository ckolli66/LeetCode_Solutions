class Solution {
    public int numberOfSubarrays(int[] nums, int k) {
        return numOfNiceSubArrays(nums,k)-numOfNiceSubArrays(nums,k-1);
    }
    public int numOfNiceSubArrays(int[] nums, int goal) {
        int left=0,right=0;
        int sum=0,count=0;
        while(right<nums.length)
        {
            sum+=(nums[right]%2);
            while(sum>goal)
            {
                sum-=(nums[left]%2);
                left++;
            }
            count=count+(right-left+1);
            right++;
        }
        return count;
    }
}