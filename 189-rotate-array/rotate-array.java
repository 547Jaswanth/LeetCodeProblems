class Solution {
    public void rotate(int[] nums, int k) {

       k=k%nums.length;

       int resArr[] = new int[nums.length];

		int k2 = 0;

		for (int i = nums.length - k; i <nums.length; i++) {
			resArr[k2++] = nums[i];
			
		}
		for (int i = 0; i < nums.length - k; i++) {
			resArr[k2++] = nums[i];

		}
           System.arraycopy(resArr,0,nums,0,nums.length);

		System.out.println(Arrays.toString(nums));
        
    }
}