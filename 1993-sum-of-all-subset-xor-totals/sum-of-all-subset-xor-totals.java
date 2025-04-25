class Solution {
    public int subsetXORSum(int[] nums) {

        return helper(nums,0,0);
        
    }
    public int helper(int nums[],int index,int currXor)
    {
        if(index==nums.length)
        {
            return currXor;
        }

        int withCurr=helper(nums,index+1,currXor ^ nums[index]);

        int withoutCurr= helper(nums,index+1,currXor);

        return withCurr+withoutCurr;
    }
}