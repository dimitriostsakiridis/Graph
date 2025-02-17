public class Main {
    public static void main(String[] args) throws Exception {
        Graph G = new Graph(3, 3, false);

        G.printMatrix();

        G.addVertex(0);
        G.addVertex(1);
        G.addVertex(2);

        // G.addEdge(0, 0, 2);
        // G.addEdge(0, 1, 4);
        G.addEdge(1, 0, 6);
        // G.addEdge(1, 1, 8);
        G.addEdge(1, 2);
        G.addEdge(2, 0);

        System.out.println("========================");
        G.printMatrix();
        System.out.println(G.getDegree(0));
        System.out.println(G.getDegree(1));
        System.out.println(G.getDegree(2));

        System.out.println(G.hasEuler());
    }
}
