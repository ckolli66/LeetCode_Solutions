class Solution {
    public boolean isZeroArray(int[] nums, int[][] queries) {
        int[] diff = new int[nums.length+1];
        for(int[] q:queries)
        {
            int l=q[0];
            int r=q[1];
            diff[l]-=1;
            if(r+1<nums.length)
            {
                diff[r+1]+=1;
            }
        }
        int current=0;
        for(int i=0;i<nums.length;i++)
        {
            current=current+diff[i];
            nums[i]=nums[i]+current;
            if(nums[i]>0)
            {
                return false;
            }
        }
        return true;
    }
}