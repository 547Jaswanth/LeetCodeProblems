class Solution {
    public long mostPoints(int[][] questions) {
        int n = questions.length;
        long[] dp = new long[n + 1];

        for (int i = 0; i < n; i++) {
            dp[i] = Math.max(dp[i], i > 0 ? dp[i - 1] : 0);

            int points = questions[i][0];
            int brainpower = questions[i][1];
            int next = i + brainpower + 1;

            if (next < n) {
                dp[next] = Math.max(dp[next], dp[i] + points);
            } else {
                dp[n] = Math.max(dp[n], dp[i] + points); // fix here
            }

            dp[i + 1] = Math.max(dp[i + 1], dp[i]);
        }

        return dp[n];
    }
}
