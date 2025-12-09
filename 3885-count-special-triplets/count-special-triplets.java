class Solution {
    private static final long MOD = 1_000_000_007;
    public int specialTriplets(int[] nums) {
        
        Map<Integer, Long> right = new HashMap<>();
        Map<Integer,Long> left = new HashMap<>();

        for(int i:nums)
        {
            right.put(i,right.getOrDefault(i,0L)+1);
        }

        long res=0;

        for(int j=0;j<nums.length;j++)
        {
            right.put(nums[j],right.get(nums[j])-1);
            if(right.get(nums[j])==0)
            {
                right.remove(nums[j]);
            }

            long target = nums[j]*2L;

            long leftCount = left.getOrDefault((int)target,0L);
            long rightCount = right.getOrDefault((int)target,0L);

            res = (res+(leftCount*rightCount)%MOD)%MOD;

            left.put(nums[j],left.getOrDefault(nums[j],0L)+1);
        }
        return (int)(res%MOD);



    }
}