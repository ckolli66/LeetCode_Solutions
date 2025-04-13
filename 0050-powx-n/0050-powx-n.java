class Solution {
    public double myPow(double x, int n) {
    long N=n; //For Negative Powers x power (-n)
        if(N<0)
        {
            x=1/x;
            N=-N; //I am multiplying it with -sign to make it positive
        }
        return helperPow(x,N);
    }

    public double helperPow(double x,long n)
    {
        if(n==0)
        {
            return 1;
        }
        double half=helperPow(x,n/2);
        double result=half*half;
        if(n%2==1)
        {
            result*=x;
        }
        return result;
    }
}