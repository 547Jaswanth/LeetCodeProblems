class Solution {
    public int minTimeToVisitAllPoints(int[][] points) {

        int sum=0;
        for(int i=0;i<points.length-1;i++)
        {
            int x1= points[i][0];
            int y1= points[i][1];

            int x2= points[i+1][0];
            int y2= points[i+1][1];

            int xDiff = Math.abs(x1-x2);
            int yDiff = Math.abs(y1-y2);

            sum+=Math.max(xDiff,yDiff);
        }
        
        return sum;
    }
}