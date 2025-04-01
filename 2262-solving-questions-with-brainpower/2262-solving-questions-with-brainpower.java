class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1]; // DP array where dp[i] is max points achievable from i to end

        for (int i = n - 1; i >= 0; i--) { // Traverse in reverse order (Back-to-Front)
            int points = questions[i][0];  // Points for this question
            int skip = questions[i][1];    // How many questions to skip
            int nextIndex = i + skip + 1;  // First index we can attempt after taking this question

            // Option 1: Take the question and add points from dp[nextIndex]
            long take = points + (nextIndex < n ? dp[nextIndex] : 0);

            // Option 2: Skip the question (carry forward previous best)
            long skipQ = dp[i + 1];

            // Store the max result at dp[i]
            dp[i] = Math.max(take, skipQ);
        }

        return dp[0]; // Max points starting from question 0
    }
}
