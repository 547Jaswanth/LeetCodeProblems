class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        String res="";
       
       int n=0;

        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(res.contains(String.valueOf(c)))
            {
               res = res.substring(res.indexOf(c) + 1);
            }
            res+=c;
            n=Math.max(n,res.length());
        }
        return n;
    }
}