import java.util.HashMap;
import java.util.Map;

public class Graph<T> {

    private Map<T, Integer> valueToIntHash = new HashMap<>();
    private int[][] adjMatrix;
    private T[] intToValue;

    public Graph(T[] initialList) {
        /*
        If I want to use an adj matrix, implicitly inside the graph class...
        I need to assign:
        PHL = 1
        EWR = 2
        JFK = 3
        SFO = 4
         */
        for (int i = 0; i < initialList.length; i++) {
            valueToIntHash.put(initialList[i], i);
        }
        intToValue = initialList;
        adjMatrix = new int[initialList.length][initialList.length];
    }


    public void addEdge(T src, T dest, int length) {
        addEdge(valueToIntHash.get(src), valueToIntHash.get(dest), length);
    }

    // use some other method from an implementation that handles integers only...
    public void addEdge(int src, int dest, int weight) {
        adjMatrix[src][dest] = weight;
    }

    private T lookUpBValue(int indexInAdjMatrix) {
        return intToValue[indexInAdjMatrix];
    }

    public void findLength(T phl, T jfk) {
        traverse(valueToIntHash.get(phl));
    }

    public void findShortest(T phl, T jfk) {

    }

    // some implementation I found on google... has a DFS/BFS/Djisktra's that takes an int param
    private void traverse(int src) {
        // do some stuff
    }
}
