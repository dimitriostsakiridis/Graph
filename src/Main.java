public class Main {
    public static void main(String[] args) throws Exception {
        Graph G = new Graph(2, 2, false);

        G.printMatrix();

        G.addEdge(0, 0, 2);
        G.addEdge(0, 1, 4);
        G.addEdge(1, 0, 6);
        G.addEdge(1, 1, 8);

        System.out.println("========================");
        G.printMatrix();

    }
}
