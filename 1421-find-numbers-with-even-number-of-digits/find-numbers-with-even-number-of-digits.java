class Solution {
public int findNumbers(int[] nums) {

        int n=nums.length;
        int count=0;

        for(int i=0;i<n;i++)
        {
            int numCount=0;
            int num=nums[i];
           while(num>0)
            {
                int digit=num%10;
                numCount++;

                num/=10;
            }
            if(numCount%2==0)
            {
                count++;
            }
        }
        return count;
    }
}