class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxIndices=0;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                for(int k=j+1;k<nums.length;k++)
                {
                    maxIndices=Math.max(maxIndices,(long)(nums[i]-nums[j])*nums[k]);
                }
            }
        }
        return maxIndices;
    }
}