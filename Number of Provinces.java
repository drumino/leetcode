class Solution {
    public int findCircleNum(int[][] M) {
        if (M.length == 0)
            return 0;
  
        final int N = M.length;
        boolean[] visited = new boolean[N];
  
        int circleNum = 0;
        for (int i = 0; i < N; i++)
            if (!visited[i]) {
                circleNum++;
                dfs(i, M, visited);
            }
        
        return circleNum;
    }
    private void dfs(int node, int[][] graph, boolean visited[]) {
        visited[node] = true;
        
        for (int i = 0; i < graph[node].length; i++)
            if (graph[node][i] == 1 && !visited[i])
                dfs(i, graph, visited);               
    }
  }