class Solution {
    public int majorityElement(int[] nums) {


        		 Map<Integer, Integer> map=new HashMap<Integer, Integer>();
			
			for(int i:nums)
			{
				map.put(i,map.getOrDefault(i, 0)+1);
			}
			System.out.println(map);
			
			int maxKey=-1;
			
			int maxValue=0;
			
			for(Map.Entry<Integer,Integer> entry:map.entrySet())
			{
				
				if(entry.getValue()>maxValue)
				{
					maxValue=entry.getValue();
					maxKey=entry.getKey();
				}
			}

			return maxKey;
	        

        
    }
}