import java.util.*;
class LargestTree{
    static void addEdge(LinkedList<Integer> adj[], int u, int v)
    {
        //TO-DO:
        adj[u].add(v);
        adj[v].add(u);

    }

    static int DFS(int u, LinkedList<Integer> adj[], Vector<Boolean> visited)
    {
        visited.add(u, true);
        int size = 1;

        // Iterate through all the nodes and perform DFS if the node is not yet visited
        //TO-DO:
        for(int i=0 ; i < adj[u].size(); i++){
            int v = adj[u].get(i);
            if(!visited.get(v)) {
                DFS(v, adj, visited);
            }
        }


        return 0;
    }

    public int largestTree(LinkedList<Integer> adj[], int V)
    {
        //TO-DO:
        Vector<Boolean> visited = new Vector<>(V);
        for(int i=0 ; i < adj.length; i++){
            {
                DFS(i,adj,visited);
            }
        }
        return 0;
    }
}