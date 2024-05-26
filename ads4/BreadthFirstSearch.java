import java.util.*;

public class BreadthFirstSearch<V> {
    public List<Vertex<V>> bfs(WeightedGraph<V> graph, Vertex<V> start) {
        List<Vertex<V>> visited = new ArrayList<>();
        Queue<Vertex<V>> queue = new LinkedList<>();
        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> vertex = queue.poll();
            for (Edge<V> edge : graph.getEdges(vertex)) {
                Vertex<V> dest = edge.getDest();
                if (!visited.contains(dest)) {
                    visited.add(dest);
                    queue.add(dest);
                }
            }
        }
        return visited;
    }
}
