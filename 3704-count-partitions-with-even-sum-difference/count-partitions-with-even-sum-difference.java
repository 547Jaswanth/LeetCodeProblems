class Solution {
    public int countPartitions(int[] nums) {
        	
		int count=0;
		
		for(int i=1;i<nums.length;i++)
		{
			int left[] = Arrays.copyOfRange(nums, 0,i);
			
			int right[] = Arrays.copyOfRange(nums, i,nums.length);
			
			int leftArraySum= Arrays.stream(left).sum();
			int rightArraySum= Arrays.stream(right).sum();
			
			if((leftArraySum - rightArraySum)%2==0)
			{
				count++;
			}
			
		}
		return count;
        
    }
}