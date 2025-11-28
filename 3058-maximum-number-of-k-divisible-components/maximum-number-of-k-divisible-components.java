class Solution {
    int count=0;
    int k;
    public int maxKDivisibleComponents(int n, int[][] edges, int[] values, int k) {
        this.k=k;

        List<Integer>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++) graph[i]= new ArrayList<>();

        for(int[] e:edges)
        {
            graph[e[0]].add(e[1]);
            graph[e[1]].add(e[0]);
        }
        dfs(0,-1,graph,values);
        return count;
    }

    private long dfs(int node,int parent,List<Integer>[] graph,int values[])
    {
        long sum=values[node];

        for(int nei : graph[node])
        {
            if(nei == parent) continue;
            sum += dfs(nei, node, graph,values);
        }

        if(sum%k==0)
        {
            count++;
            return 0;
        }
        return sum;
    }
}