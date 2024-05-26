import java.util.*;

public class DijkstraSearch<V> {
    public Map<Vertex<V>, Double> dijkstra(WeightedGraph<V> graph, Vertex<V> start) {
        Map<Vertex<V>, Double> distances = new HashMap<>();
        PriorityQueue<VertexDistancePair<V>> pq = new PriorityQueue<>(Comparator.comparing(VertexDistancePair::getDistance));
        distances.put(start, 0.0);
        pq.add(new VertexDistancePair<>(start, 0.0));

        while (!pq.isEmpty()) {
            VertexDistancePair<V> pair = pq.poll();
            Vertex<V> vertex = pair.getVertex();

            for (Edge<V> edge : graph.getEdges(vertex)) {
                Vertex<V> dest = edge.getDest();
                double newDist = distances.get(vertex) + edge.getWeight();
                if (newDist < distances.getOrDefault(dest, Double.MAX_VALUE)) {
                    distances.put(dest, newDist);
                    pq.add(new VertexDistancePair<>(dest, newDist));
                }
            }
        }
        return distances;
    }

    private static class VertexDistancePair<V> {
        private Vertex<V> vertex;
        private double distance;

        public VertexDistancePair(Vertex<V> vertex, double distance) {
            this.vertex = vertex;
            this.distance = distance;
        }

        public Vertex<V> getVertex() {
            return vertex;
        }

        public double getDistance() {
            return distance;
        }
    }
}
