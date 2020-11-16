import java.util.LinkedList;
import java.util.List;

public class AdjListGraph {
    // adjacency list implementation of graph
    // unweighted, undirected
    // limited to just integers
    // 0, 1, 2, 4

    final int NUM_NODES = 5;
    private List<Integer>[] adjList = new LinkedList[NUM_NODES];

    public void addEdge(int src, int dest) {
        if (adjList[src] == null) {
            // this is the first neighbor
            adjList[src] = new LinkedList<Integer>();
        }
        adjList[src].add(dest);

        if (adjList[dest] == null) {
            // this is the first neighbor
            adjList[dest] = new LinkedList<Integer>();
        }
        adjList[dest].add(src);

    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int node = 0; node < NUM_NODES; node++) {
            sb.append("\n\nNode: " + node + " has neighbors: ");
            // iterate through the linked list
            sb.append(adjList[node].toString());
        }

        return sb.toString();
    }
}

class Driver1 {
    public static void main(String[] args) {
        AdjListGraph graph1 = new AdjListGraph();

        graph1.addEdge(0, 1);
        graph1.addEdge(2, 1);
        graph1.addEdge(4, 3);

        System.out.println(graph1);
    }
}
