class Solution {
    public long maximumTripletValue(int[] nums) {
        long maxPrefix=nums[0];
        long maxDiff=0;
        long res=0;
        for(int k=1;k<nums.length;k++)
        {
            res=Math.max(res,maxDiff*nums[k]);
            maxDiff=Math.max(maxDiff,(maxPrefix-nums[k]));
            maxPrefix=Math.max(maxPrefix,nums[k]);
        }
        return res;
    }
}