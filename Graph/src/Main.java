public class Main {
    public static void main(String[] args) throws Exception {
        Graph g = new Graph(3);
        System.out.println(g.adjmatrix());
        
        g.insertVertice("A", 0);
        g.insertVertice("B", 1);
        g.insertVertice("C", 2);
        
        g.newEdge(0, 1);
        g.newEdge(1, 2);
        g.newEdge(2, 0);

        g.newEdge(0, 0);
        
        System.out.println(g.adjmatrix());
    }
}
