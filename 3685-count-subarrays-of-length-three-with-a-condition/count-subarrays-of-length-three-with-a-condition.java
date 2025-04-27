class Solution {
   public int countSubarrays(int[] nums) {

		int count = 0;

		for (int i = 0; i <= nums.length - 3; i++) {
			int arr[] = new int[3];

			arr[0] = nums[i];
			arr[1] = nums[i + 1];
			arr[2] = nums[i + 2];

			if (arr[0] + arr[2] == arr[1]/2.0) {
				count++;
			}
		}
		return count;
	}

}