import java.util.*;
class Solution {
    public int maxArea(int[] height) {
        int n=height.length;

        int left=0;int right=n-1;

        int max=0;

        while(left<right)
        {
         int width=right-left;

         int min=Math.min(height[left],height[right]);
         int area= min*width;

        if(area>max)
        {
            max=area;
        }

        if(height[left]>height[right])
        {
            right--;
        }
        else
        {
            left++;
        }
        }
        return max;
    }
}