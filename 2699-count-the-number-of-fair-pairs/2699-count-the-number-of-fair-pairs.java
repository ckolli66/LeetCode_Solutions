class Solution {
    public long countFairPairs(int[] nums, int lower, int upper) {
        Arrays.sort(nums);
        long count=0;
        for(int i=0;i<nums.length;i++)
        {
           int low = lower-nums[i];
           int up = upper-nums[i];
           count+=(binSearch(nums,i+1,nums.length-1,up+1)-binSearch(nums,i+1,nums.length-1,low));
        }
        return count;
    }

    public int binSearch(int[] nums,int left,int right,int target)
    {
        while(left<=right)
        {
            int mid = left+(right-left)/2;

            if(nums[mid]>=target)
            {
                right=mid-1;
            }else
            {
                left=mid+1;
            }
        }
        return right;
    }
}