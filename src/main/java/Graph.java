import java.util.ArrayList;
import java.util.List;

public class Graph {

    int v;
    int e;
    List<Integer>[] adj;

    public Graph(int v){
        this.v = v;
        adj = new List[v];
        for(int i=0 ;i < adj.length; i++){
            adj[i] = new ArrayList<>();
        }

    }

    public int V(){
        return this.v;
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
        adj[w].add(v);
    }

    public List<Integer> getAdj(int v){
        return adj[v];
    }

}
