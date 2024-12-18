class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();


		String res = "";

		for (char ch : s.toCharArray()) {
			if (ch >= 'a' && ch <= 'z') {
				res += ch;
			}
		}

		res = s.replaceAll("[^a-zA-Z0-9]", "");
		
		int start = 0;
		int end = res.length() - 1;

		while (start < end) {
			if (res.charAt(start) != res.charAt(end)) {
				return false;
				
			}

			start++;
			end--;

		}
		return true;

        
    }
}