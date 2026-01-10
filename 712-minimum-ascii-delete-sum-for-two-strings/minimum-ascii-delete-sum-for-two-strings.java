class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        
        //1. get lengths if both strings
        int len1 = s1.length();
        int len2 = s2.length();

        //2. create DP table
        int[][] dp = new int[len1+1][len2+1];

        //3. Fill the DP table.
        for(int i=1;i<=len1;i++)
        {
            for(int j=1;j<=len2;j++)
            {
                //4. If charecter match
                if(s1.charAt(i-1)==s2.charAt(j-1))
                {
                    dp[i][j] = dp[i-1][j-1]+s1.charAt(i-1);
                }
                else
                {//5. if character do not match
                    dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1]);
                }
            }
        }

        //6. calculate total ASCII sum of s1
        int total1=0;
        for(int i=0;i<len1;i++)
        {
            total1+=s1.charAt(i);
        }

        //7. calculate total ASCII sum of s2
        int total2=0;
        for(int i=0;i<len2;i++)
        {
            total2+=s2.charAt(i);
        }

        //8. maximum ASCII sum of common subsequence
        int commonAsciiSum = dp[len1][len2];

        //9. Final answer
        // Delete cost = total1 + total2 - 2* commonAsciiSum
        return total1+total2-2*commonAsciiSum;
    }
}