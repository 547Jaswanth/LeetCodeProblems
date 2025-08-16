class Solution {
    public int maximum69Number (int num) {

        
		String s = String.valueOf(num);

		
		if(!s.matches("[69]+"))
		{
			return 0;
		}
		
		return IntStream.range(0, s.length())
				.map(i ->{
					char[] chars=s.toCharArray();
					
					chars[i] =(chars[i]=='6')?'9':chars[i];
					
					return Integer.parseInt(new String(chars));
				})
				.max()
				.orElse(num);
		
        
        
    }
}