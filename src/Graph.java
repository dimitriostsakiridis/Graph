class Vertex {
    Object data;

    public Vertex() {
        this(null);
    }

    public Vertex(Object data) {
        this.data = data;
    }

    public void setData(Object x) {
        this.data = x;
    }

    public Object getData() {
        return this.data;
    }
}

public class Graph implements IGraph {
    public int[][] edges;
    private Vertex[] vertices;
    private int edgeCount = 0;
    private int vertexCount = 0;
    private boolean isDirected;

    public Graph(int V, int E) {
        this(V, E, false);
    }

    public Graph(int V, int E, boolean isDirected) {
        this.edges = new int[E][E];
        this.vertices = new Vertex[V];
        this.isDirected = isDirected;
    }

    public void addVertex(Object[] V) {
        for (int i = 0; i < V.length; i++)
            addVertex(V[i]);
    }

    public void addVertex(Object V) {
        addVertex(new Vertex(V));
    }

    private void addVertex(Vertex V) {
        if (vertexCount >= vertices.length) {
            Vertex[] vArray = new Vertex[vertices.length * 2];
            System.arraycopy(this.vertices, 0, vArray, 0, vertices.length);
            this.vertices = vArray;
            resizeEdges(vertices.length);
        }
        this.vertices[vertexCount++] = V;
    }

    private void resizeEdges(int size) {
        int[][] eArray = new int[size][size];
        for (int i = 0; i < eArray.length; i++)
            System.arraycopy(this.edges[i], 0, eArray[i], 0, edgeCount);
        this.edges = eArray;
    }

    public void addEdge(int src, int dest) throws Exception {
        addEdge(src, dest, 1);
    }

    public void addEdge(int src, int dest, int weight) throws Exception {
        if (!(src < this.edges.length && dest < this.edges.length))
            throw new IllegalArgumentException("Invalid Index");
        this.edges[src][dest] = weight;
        if (!isDirected)
            this.edges[dest][src] = weight;

    }

    public void printMatrix() {
        for (int i = 0; i < edges.length; i++) {
            for (int j = 0; j < edges[i].length; j++)
                System.out.print(edges[i][j] + " ");
            System.out.println();
        }

    }
}
