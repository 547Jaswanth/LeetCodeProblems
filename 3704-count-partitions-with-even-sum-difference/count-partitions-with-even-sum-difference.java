class Solution {
    public int countPartitions(int[] nums) {
        	
		int count=0;
		int total=0;
        for(int i:nums) total+=i;
		int left=0;
		int right=0;
		for(int i=0;i<nums.length-1;i++)
		{
			left+=nums[i];
			right=total-left;
			
			if((left%2) ==(right%2))
			{
				count++;
			}
		}
		return count;
    }
}