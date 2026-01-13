class Solution {
    public double separateSquares(int[][] squares) {
        double totalArea = 0;
        double low = Double.MAX_VALUE, high = 0;
        for(int[] s: squares)
        {
            double y = s[1], l= s[2];
            totalArea +=l*l;
            low = Math.min(low,y);
            high = Math.max(high, y+l);
        }
        double target = totalArea/2.0;
        while(high-low>1e-5)
        {
            double mid =(low+high)/2;
            double below = 0;

            for(int[] s:squares)
            {
                double y = s[1], l=s[2];
                if(mid<=y)
                {
                    //nothing will contribute
                }
                else if( mid>= y+l)
                {
                    below += l*l;
                }else
                {
                    below += l*(mid -y);
                }
            }    
            if(below<target)
            {
                low = mid;
            }
            else{
                high = mid;
            }
        }
        return low;
    }
}