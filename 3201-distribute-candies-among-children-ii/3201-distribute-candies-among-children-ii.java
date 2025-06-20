class Solution {
    public long distributeCandies(int n, int limit) {
        long result=0;
        for(int i=0;i<=Math.min(n,limit);i++)
        {
            if(n-i>2*limit)
            {
                continue;
            }
            result+=Math.min(limit,n-i)-Math.max(0,n-i-limit)+1;
        }
        return result;
    }
}