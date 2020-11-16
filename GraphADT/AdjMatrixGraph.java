// simple adjmatrix of integers
// // https://www.programiz.com/dsa/graph-adjacency-matrix

public class AdjMatrixGraph {
    // undirected, unweighted


    // can only hold integers
    // in this particular, very limited implementation
    // we only have 5 nodes... and the values of those nodes are fixed...

    // we can only have nodes with value 0, 1, 2, 3, 4

    final int NUM_NODES = 5;
    private boolean[][] adjMatrix = new boolean[NUM_NODES][NUM_NODES];
    // in this implementation
    // the index is the same as the "data" for a given node

    public void addEdge(int src, int dest) {
        adjMatrix[src][dest] = true;
        adjMatrix[dest][src] = true;
        // addEdge(dest, src);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int nodes = 0; nodes < adjMatrix[0].length; nodes++) {
            sb.append("\n\nNode: " + nodes + " has neighbors: ");
            for (int neightbors = 0; neightbors < adjMatrix[nodes].length; neightbors++) {
                if (adjMatrix[nodes][neightbors]) {
                    sb.append(neightbors + " ");
                }
            }
        }

        return sb.toString();

    }

}

class Driver {
    public static void main(String[] args) {
        AdjMatrixGraph graph1 = new AdjMatrixGraph();

        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(4, 3);
        // directed?  weighted?

        System.out.println(graph1);
    }
}
