public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A", "B", 1);
        graph.addEdge("A", "C", 4);
        graph.addEdge("B", "C", 2);
        graph.addEdge("B", "D", 5);
        graph.addEdge("C", "D", 1);

        BreadthFirstSearch<String> bfs = new BreadthFirstSearch<>();
        System.out.println("BFS traversal: " + bfs.bfs(graph, new Vertex<>("A")));

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>();
        System.out.println("Dijkstra shortest paths: " + dijkstra.dijkstra(graph, new Vertex<>("A")));
    }
}
