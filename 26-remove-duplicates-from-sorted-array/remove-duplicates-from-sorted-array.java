class Solution {
    public int removeDuplicates(int[] nums) 
    {
      
Set<Integer> set=new TreeSet<Integer>();
		
		int j=0;
		for(int i:nums)
		{
			set.add(i);
		}
		
		for(int k:set)
		{
			nums[j++]=k;
			
		}
        //System.out.println(set);
		int n=nums.length;
        return set.size();
		

    }
}
 