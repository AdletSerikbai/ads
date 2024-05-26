import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<V>>> map = new HashMap<>();

    public void addVertex(V data) {
        map.putIfAbsent(new Vertex<>(data), new LinkedList<>());
    }

    public void addEdge(V source, V dest, double weight) {
        Vertex<V> v1 = new Vertex<>(source);
        Vertex<V> v2 = new Vertex<>(dest);
        Edge<V> edge = new Edge<>(v1, v2, weight);
        map.get(v1).add(edge);
    }

    public List<Edge<V>> getEdges(Vertex<V> vertex) {
        return map.get(vertex);
    }
}
