import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GraphTest {

    @Test
    public void testSimpleGraphTwoNodes (){
        Graph g= new Graph(2);
        g.addEdge(0,1);

        assertEquals(g.V(),2);
    }

    @Test
    public void testSimpleGraphFourNodes (){
        Graph g= new Graph(4);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(2,3);
        //checking number of vertices
        assertEquals(g.V(),4);

        //checking adjacent nodes of 0
        assertEquals(g.getAdj(0).size(),1 );

        //checking adjacent nodes of 1
        assertEquals(g.getAdj(1).size(),2 );

        //checking adjacent nodes of 2
        assertEquals(g.getAdj(2).size(),2 );

        //checking adjacent nodes of 3
        assertEquals(g.getAdj(3).size(),1 );

    }

}