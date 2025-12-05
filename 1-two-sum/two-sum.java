class Solution {
   public static int[] twoSum(int[] nums, int target) {
		int num[]=new int[2];

        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int sno=target-nums[i];
            if(map.containsKey(sno))
            {
                num[0]=map.get(sno);
                num[1]=i;
                break;
            }
            map.put(nums[i],i);
        }
      return num;
	}
}