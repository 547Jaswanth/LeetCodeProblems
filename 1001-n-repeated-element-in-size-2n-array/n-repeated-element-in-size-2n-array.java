class Solution {
    public int repeatedNTimes(int[] nums) {

        Map<Integer,Integer> map= new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }        
        int max= map.entrySet()
                    .stream()
                    .max(Map.Entry.comparingByValue())
                    .map(Map.Entry::getKey)
                    .orElse(-1);

     return max;
        
    }
}