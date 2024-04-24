class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        if (rooms == null)
            return true;
  
        int N = rooms.size();
        boolean[] visited = new boolean[N];
        
        dfs(0, rooms, visited);
        
        for (int i = 0; i < N; i++)
            if (!visited[i])
                return false;
  
        return true;
    }
    private void dfs(int node, List<List<Integer>> graph, boolean visited[]) {
        visited[node] = true;
  
        for (int neighbour : graph.get(node))
            if (!visited[neighbour])
                dfs(neighbour, graph, visited);
    }
  }