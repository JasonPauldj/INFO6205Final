import org.junit.Assert;
import org.junit.Test;

import java.util.LinkedList;

import static org.junit.Assert.*;

public class DepthFirstSearchTest {

    @Test
    public void testOne() {
        Graph g = new Graph(9);

        g.addEdge(0,1);
        g.addEdge(1,2);
         g.addEdge(2,7);


        g.addEdge(3,4);
        g.addEdge(4,8);

        g.addEdge(5,6);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);

        assertEquals(4,depthFirstSearch.getMaxSizeTree());
    }

    @Test
    public void test1(){
//        int[][] edges = {{0,1},{1,2},{3,4}};
//        LargestTree tree = new LargestTree();
//        int V = 5;
//        LinkedList<Integer> adj[] = new LinkedList[V];
//        for (int i = 0; i < adj.length; i++)
//            adj[i] = new LinkedList<>();
//        tree.addEdge(adj, 0, 1);
//        tree.addEdge(adj, 0, 2);
//        tree.addEdge(adj, 3, 4);
    //    Assert.assertEquals(3, tree.largestTree(adj,V));

        Graph g = new Graph(5);

        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(3,4);



        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);

        Assert.assertEquals(3, depthFirstSearch.getMaxSizeTree());
    }


    @Test
    public void test2(){
        Graph g = new Graph(8);

        g.addEdge(0,1);
        g.addEdge(1,3);
        g.addEdge(1,4);


        g.addEdge(1,5);
        g.addEdge(2,6);

        g.addEdge(6,7);

        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);

        Assert.assertEquals(5, depthFirstSearch.getMaxSizeTree());
    }

//    @Test
//    public void test2(){
//        int[][] edges = {{0,1},{1,3},{1,4},{1,5},{2,6},{6,7}};
//        LargestTree tree = new LargestTree();
//        int V = 8;
//        LinkedList<Integer> adj[] = new LinkedList[V];
//        for (int i = 0; i < adj.length; i++)
//            adj[i] = new LinkedList<>();
//        tree.addEdge(adj, 0, 1);
//        tree.addEdge(adj, 1, 3);
//        tree.addEdge(adj, 1, 4);
//        tree.addEdge(adj, 1, 5);
//        tree.addEdge(adj, 2, 6);
//        tree.addEdge(adj, 6, 7);
//        Assert.assertEquals(5, tree.largestTree(adj,V));
//    }

    @Test
    public void test3(){
//        int[][] edges = {{0,1},{2,3},{4,5},{6,7},{8,9}};
//        LargestTree tree = new LargestTree();
//        int V = 10;
//        LinkedList<Integer> adj[] = new LinkedList[V];
//        for (int i = 0; i < adj.length; i++)
//            adj[i] = new LinkedList<>();
//        tree.addEdge(adj, 0, 1);
//        tree.addEdge(adj, 2, 3);
//        tree.addEdge(adj, 4, 5);
//        tree.addEdge(adj, 6, 7);
//        tree.addEdge(adj, 8, 9);
//        Assert.assertEquals(2, tree.largestTree(adj,V));

        Graph g = new Graph(10);

        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(4,5);


        g.addEdge(6,7);
        g.addEdge(8,9);


        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);

        Assert.assertEquals(2, depthFirstSearch.getMaxSizeTree());



    }

    @Test
    public void test4(){
//        int[][] edges = {{0,1},{2,3},{4,5},{4,6}};
//        LargestTree tree = new LargestTree();
//        int V = 7;
//        LinkedList<Integer> adj[] = new LinkedList[V];
//        for (int i = 0; i < adj.length; i++)
//            adj[i] = new LinkedList<>();
//        tree.addEdge(adj, 0, 1);
//        tree.addEdge(adj, 2, 3);
//        tree.addEdge(adj, 4, 5);
//        tree.addEdge(adj, 4, 6);
//        Assert.assertEquals(3, tree.largestTree(adj,V));


        Graph g = new Graph(7);

        g.addEdge(0,1);
        g.addEdge(2,3);
        g.addEdge(4,5);
        g.addEdge(4,6);



        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);

        Assert.assertEquals(3, depthFirstSearch.getMaxSizeTree());

    }

    @Test
    public void test5(){
//        int[][] edges = {};
//        LargestTree tree = new LargestTree();
//        int V = 0;
//        LinkedList<Integer> adj[] = new LinkedList[V];
//        for (int i = 0; i < adj.length; i++)
//            adj[i] = new LinkedList<>();
//        if(edges.length == 0 && V == 0)
//            Assert.assertEquals(0, tree.largestTree(adj,V));

        Graph g = new Graph(0);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);
        Assert.assertEquals(0, depthFirstSearch.getMaxSizeTree());    }

    @Test
    public void test6(){
        int[][] edges = {{0,0}};
        LargestTree tree = new LargestTree();
        int V = 1;
        LinkedList<Integer> adj[] = new LinkedList[V];
        for (int i = 0; i < adj.length; i++)
            adj[i] = new LinkedList<>();
        tree.addEdge(adj, 0, 0);

        //Assert.assertEquals(1, tree.largestTree(adj,V));

        Graph g = new Graph(1);
        g.addEdge(0,0);
        DepthFirstSearch depthFirstSearch = new DepthFirstSearch(g);
        Assert.assertEquals(1, depthFirstSearch.getMaxSizeTree());


    }

}