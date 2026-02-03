class Solution {
    public int secondHighest(String s) {

        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;

        for(int i=0;i<s.length();i++)
        {
            int ch= s.charAt(i)-'0';

            if(ch>=0 && ch<=9)
            {
                if(ch>max1)
                {
                    max2=max1;
                    max1=ch;
                }
                else if(ch>max2 && ch!=max1)
                {
                    max2=ch;
                }
            }
        }
        if(max2== Integer.MIN_VALUE)
        {
            return -1;
        }
return max2;
        
    }
}