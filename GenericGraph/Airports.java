public class Airports {
    public static void main(String[] args) {

        String[] airports = {"PHL", "EWR", "JKF", "SFO"};

        /*
        If I want to use an adj matrix, implicitly inside the graph class...
        I need to assign:
        PHL = 1
        EWR = 2
        JFK = 3
        SFO = 4

         */

        Graph<String> airportGraph = new Graph(airports);

        airportGraph.addEdge("PHL", "EWR", 5);
        airportGraph.addEdge("JFK", "EWR", 3);
        airportGraph.addEdge("PHL", "SFO", 8);

        airportGraph.findLength("PHL", "JFK");
    }
}
