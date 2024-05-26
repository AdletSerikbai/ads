# Weighted Graph Implementation with BFS and Dijkstra's Algorithm

This project implements a weighted graph using vertices instead of edges and includes implementations for Breadth-First Search (BFS) and Dijkstra's algorithm for finding the shortest path.

## Table of Contents
- [Introduction](#introduction)
- [Classes](#classes)
  - [Vertex](#vertex)
  - [Edge](#edge)
  - [WeightedGraph](#weightedgraph)
  - [BreadthFirstSearch](#breadthfirstsearch)
  - [DijkstraSearch](#dijkstrasearch)
- [Usage](#usage)
- [Example](#example)
- [Setup](#setup)
- [License](#license)

## Introduction
This project demonstrates a basic implementation of a weighted graph, where vertices are connected by weighted edges. The graph supports the addition of vertices and edges, and includes algorithms for traversing the graph using BFS and finding the shortest path using Dijkstra's algorithm.

## Classes

### Vertex
Represents a vertex in the graph, holding data and a map of adjacent vertices with their corresponding weights.
```java
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjacentVertices;

    public Vertex(V data) { /*...*/ }
    public void addAdjacentVertex(Vertex<V> destination, double weight) { /*...*/ }
    public V getData() { /*...*/ }
    public Map<Vertex<V>, Double> getAdjacentVertices() { /*...*/ }
}
```

### Edge
Represents an edge in the graph, connecting two vertices with a specified weight.
```java
public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> dest;
    private double weight;

    public Edge(Vertex<V> source, Vertex<V> dest, double weight) { /*...*/ }
    public Vertex<V> getSource() { /*...*/ }
    public Vertex<V> getDest() { /*...*/ }
    public double getWeight() { /*...*/ }
}
```

### WeightedGraph
Maintains a map of vertices and their edges, allowing for the addition of vertices and edges.
```java
public class WeightedGraph<V> {
    private Map<Vertex<V>, List<Edge<V>>> map = new HashMap<>();

    public void addVertex(V data) { /*...*/ }
    public void addEdge(V source, V dest, double weight) { /*...*/ }
    public List<Edge<V>> getEdges(Vertex<V> vertex) { /*...*/ }
}
```

### BreadthFirstSearch
Implements BFS to traverse the graph from a given start vertex.
```java
public class BreadthFirstSearch<V> {
    public List<Vertex<V>> bfs(WeightedGraph<V> graph, Vertex<V> start) { /*...*/ }
}
```

### DijkstraSearch
Implements Dijkstra's algorithm to find the shortest path from a given start vertex.
```java
public class DijkstraSearch<V> {
    public Map<Vertex<V>, Double> dijkstra(WeightedGraph<V> graph, Vertex<V> start) { /*...*/ }
}
```

## Usage
To use this code, create instances of `Vertex`, `Edge`, and `WeightedGraph`, add vertices and edges to the graph, and perform BFS or Dijkstra's algorithm to traverse the graph or find the shortest path.

## Example
```java
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
```

## Setup
1. Clone the repository.
2. Open the project in your favorite IDE.
3. Run the `Main` class to see the example usage.

## License
This project is licensed under the MIT License. See the LICENSE file for details.
