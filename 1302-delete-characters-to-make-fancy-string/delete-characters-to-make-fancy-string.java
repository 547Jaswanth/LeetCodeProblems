class Solution {
    public String makeFancyString(String s) {

        StringBuffer res = new StringBuffer();

		int cCount = 1;
//		L e e e t C o d e
//		0 1 2 3 4 5 6 7 8  

		res.append(s.charAt(0));

		for (int i = 1; i < s.length(); i++) {

			if (s.charAt(i) == s.charAt(i - 1)) {
				cCount++;
			} else {
				cCount = 1;
			}
			if (cCount < 3) {
				res.append(s.charAt(i));
			}
		}
		return res.toString();

        
    }
}