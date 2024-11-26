
//Imports
import java.util.NoSuchElementException;
import java.util.Scanner;

//Classes
class Vertice {
    // Attributes
    private Object data;
    private int index;// As a means of Node-Vertice identification

    // Constructors
    public Vertice() {
    }

    public Vertice(Object x, int i) {
        this.data = x;
        this.index = i;
    }

    // Set-Get Methods
    public int getIndex() {
        return this.index;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object x) {
        this.data = x;
    }

    // toString Method
    @Override
    public String toString() {
        return ("Node " + this.index + ": " + this.data);
    }

}

public class Graph {
    // Attributes
    private Vertice[] vertices;
    private int[][] edges;

    // Constructors
    public Graph() {
        this(1);
    }

    public Graph(int vertices) {
        this.vertices = new Vertice[vertices];
        this.edges = new int[vertices][vertices];
    }

    // Set-Get Methods
    public Vertice getVertice(int i) {
        if (!(i < this.vertices.length) || i < 0)
            return null;
        return this.vertices[i];
    }

    public void insertVertice(Object x, int index) {
        if (getVertice(index) != null) {
            System.out.println("Replace Vertice " + index + "?(Y/N)");
            Scanner input = new Scanner(System.in);
            String opt = input.nextLine().toUpperCase();
            switch (opt) {
                case "Y":
                    this.vertices[index] = new Vertice(x, index);
                default:
                    return;
            }
        }
        this.vertices[index] = new Vertice(x, index);
    }

    public void newEdge(int x, int y) throws NoSuchElementException {
        if (this.getVertice(x) == null)
            throw new NoSuchElementException("Starting vertice not found.");
        if (x != y)
            this.edges[x][y] = this.edges[y][x] = 2;
        else
            this.edges[x][y] = 2;
    }

    public String adjmatrix() {
        String s;
        for (int i = 0; i < this.edges.length; i++) {
            s += "\n";
            for (int j = 0; j < this.edges.length; j++)
                s += this.edges[i][j] + "\t";
        }

        return s;
    }
}
