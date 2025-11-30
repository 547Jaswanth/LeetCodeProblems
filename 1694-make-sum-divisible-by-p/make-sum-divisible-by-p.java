class Solution
 {
    public int minSubarray(int[] nums, int p)
    {
        long total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        int rem=(int) (total%p);

        if(rem==0) return 0;

        Map<Integer,Integer> map= new HashMap<>();
        map.put(0,-1);

        long prefix = 0;
        int minLen = nums.length;

        for(int j=0;j<nums.length;j++)
        {
            prefix+=nums[j];

            int prefixMod = (int)(prefix%p);

            int target = (prefixMod-rem+p)%p;

            if(map.containsKey(target))
            {
                minLen = Math.min(minLen,j-map.get(target));
            }
            map.put(prefixMod,j);
        }

        return (minLen == nums.length)?-1:minLen;
    }
}