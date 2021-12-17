public class DepthFirstSearch {

    int v;
    boolean[] marked;
    Graph G;
    int size;
    int maxSize=Integer.MIN_VALUE;

    public DepthFirstSearch(Graph G){
        this.G =G;
        this.v = G.v;
        this.marked = new boolean[v];

        if(v==0)
        {
            maxSize=0;
        }

        else {
            for (int i = 0; i < v; i++) {
                {
                    if (!marked[i]) {
                        size = 0;
                        dfs(i);
                        if (size > maxSize) {
                            maxSize = size;
                        }

                    }

                }
            }
        }
    }

    public int getMaxSizeTree(){
        return maxSize;
    }

    public void dfs(int v){

        marked[v]=true;

        for(int i : G.getAdj(v)){
            if(!marked[i]){
                dfs(i);
            }
        }
        size++;
    }

}
