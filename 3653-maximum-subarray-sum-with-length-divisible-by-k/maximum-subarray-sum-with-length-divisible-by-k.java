class Solution {
    public long maxSubarraySum(int[] nums, int k) {

        int n = nums.length;
        long[] minPrefix = new long[k];
        for (int i = 0; i < k; i++) minPrefix[i] = Long.MAX_VALUE;
        long prefix = 0;
        long maxSum = Long.MIN_VALUE;

        minPrefix[0] = 0;

        for (int idx = 1; idx <= n; idx++) {
            prefix += nums[idx - 1];
            int r = idx % k;
            if (minPrefix[r] != Long.MAX_VALUE) {
                long candidate = prefix - minPrefix[r];
                if (candidate > maxSum) maxSum = candidate;
            }
            if (prefix < minPrefix[r]) minPrefix[r] = prefix;
        }

        return maxSum;
    }
}
