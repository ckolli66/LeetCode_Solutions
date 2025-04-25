class Solution {
    public int countLargestGroup(int n) {
        HashMap<Integer,Integer> freq= new HashMap<Integer,Integer>();
        for(int i=1;i<=n;i++)
        {
           freq.put(digitSum(i),freq.getOrDefault(digitSum(i),0)+1);
        }
        int max=Collections.max(freq.values());
        int cnt=0;
        for(int num:freq.values())
        {
            if(num==max)
            {
                cnt++;
            }
        }
        return cnt;
    }

    public int digitSum(int n)
    {
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        return sum;
    }
}