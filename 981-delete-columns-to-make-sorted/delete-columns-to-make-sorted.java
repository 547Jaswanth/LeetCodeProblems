class Solution {
    public int minDeletionSize(String[] strs) {

        int count=0;
        int cols=strs[0].length();

        for(int i=0;i<cols;i++)
        {
           for(int j=1;j<strs.length;j++)
           {
            if(strs[j-1].charAt(i)>strs[j].charAt(i))
            {
               count++;
               break;
            }
           }

        }
        return count;
        
    }
}