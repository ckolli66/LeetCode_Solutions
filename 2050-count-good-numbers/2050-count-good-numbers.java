class Solution {
    public static final int MOD = 1000000007;

    public int countGoodNumbers(long n) {
        long evenDigits = (n + 1) / 2; //ceil of number
        long oddDigits = n / 2; //floor of number

        long result = (powOfN(5, evenDigits) * powOfN(4, oddDigits)) % MOD;

        return (int) result;
    }

    public long powOfN(long x, long n) {
        if (n == 0) return 1;

        long half = powOfN(x, n / 2);
        long result = (half * half) % MOD;

        if (n % 2 == 1) {
            result = (result * x) % MOD;
        }

        return result;
    }
}
