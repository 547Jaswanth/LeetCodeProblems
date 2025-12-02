class Solution {

    static final long MOD = 1_000_000_007L;
    public int countTrapezoids(int[][] points) {
        
        Map<Integer,Long> map = new HashMap<>();

        for(int[] p: points)
        {
            int y=p[1];

            map.put(y,map.getOrDefault(y,0L)+1);
        }

        List<Long> choose2 = new ArrayList<>();

        for(long count: map.values())
        {
            if(count>=2)
            {
                choose2.add((count*(count-1)/2)%MOD);
            }
        }

        long sum=0,sumSq = 0;

        for(long c2: choose2)
        {
            sum=(sum+c2)%MOD;
            sumSq = (sumSq+(c2*c2)%MOD)%MOD;
        }

        long ans = ((sum*sum%MOD - sumSq + MOD)%MOD)*inv2()%MOD;

        return(int) ans;
    }

    private long inv2()
    {
        return (MOD+1)/2;
    }
}