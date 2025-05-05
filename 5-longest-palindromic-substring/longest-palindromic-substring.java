class Solution {
    public String longestPalindrome(String s) {
          String resStr="";
        int n=s.length();

        int maxLen=0;
        for(int i=0;i<n;i++)
        {
            String str1=paliStr(s,i,i);

            if(str1.length()>maxLen)
            {
                resStr= str1;
                maxLen=str1.length();
            }

//            even

            String str2=paliStr(s,i,i+1);

            if(str2.length()>maxLen)
            {
                resStr=str2;
                maxLen=str2.length();
            }
        }
        return resStr;

    }
    public String paliStr(String s,int left,int right)
    {
        while(left>=0 && right<s.length() && s.charAt(right)==s.charAt(left))
        {
            left--;
            right++;
        }

        return s.substring(left+1,right);
        
    }
}