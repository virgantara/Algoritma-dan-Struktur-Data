import java.util.*;

public class GraphAdjacencyList {
    private Map<Integer, List<Integer>> graph;

    public GraphAdjacencyList() {
        graph = new HashMap<>();
    }

    // Menambahkan sisi ke graph
    public void addEdge(int source, int destination) {
        graph.computeIfAbsent(source, k -> new ArrayList<>()).add(destination);
        graph.computeIfAbsent(destination, k -> new ArrayList<>()).add(source); // Untuk graph tak berarah
    }

    // Menampilkan graph
    public void displayGraph() {
        for (int node : graph.keySet()) {
            System.out.println("Node " + node + " terhubung ke: " + graph.get(node));
        }
    }

    public static void main(String[] args) {
        GraphAdjacencyList graph = new GraphAdjacencyList();
        
        // Menambahkan sisi (hubungan) antar simpul
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 4);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);

        // Menampilkan graph
        graph.displayGraph();
    }
}