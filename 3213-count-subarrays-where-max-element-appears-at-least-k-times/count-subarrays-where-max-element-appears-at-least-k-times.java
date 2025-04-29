class Solution {
    public long countSubarrays(int[] nums, int k) {
        int max = Arrays.stream(nums).max().getAsInt();
        int n = nums.length;
        long res = 0;
        int left = 0, count = 0;

        for (int right = 0; right < n; right++) {
            if (nums[right] == max) {
                count++;
            }

            while (count >= k) {
                res += (n - right); 
                if (nums[left] == max) {
                    count--;
                }
                left++;
            }
        }

        return res;
    }
}
