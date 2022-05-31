package graph.breadth.first;

import java.util.*;

public class graph {
    private Map<Vertex, List<Vertex>> adjVertices;


    public graph() {
        this.adjVertices = new HashMap<>();
    }

    public Vertex addNode(String value) {
        Vertex vertex = new Vertex(value);

        adjVertices.put(vertex, new ArrayList<>());

        return vertex;
    }


    public void addEdge(String data1, String data2) {
        Vertex vertex1 = new Vertex(data1);
        Vertex vertex2 = new Vertex(data2);

        if (adjVertices.containsKey(vertex1) && adjVertices.containsKey(vertex2)) {
            adjVertices.get(vertex1).add(vertex2);
            adjVertices.get(vertex2).add(vertex1);
        }

    }

    public Map<Vertex, List<Vertex>> getAdjVertices() {
        return adjVertices;
    }

    public List getNodes() {
        List result = new ArrayList<>();
        for (Vertex vertex : adjVertices.keySet()) {
            result.add(vertex.data);
        }
        return result;
    }

    public List<Vertex> getNeighbors(Vertex vertex) {
        return adjVertices.get(vertex);

    }
    public Set<Vertex> breadth_first(Vertex vertex){
        Set<Vertex>visited=new LinkedHashSet();
        Queue<Vertex> queue=new LinkedList<>();
        queue.add(vertex);//C
        visited.add(vertex);//A//D//C
        while(!queue.isEmpty()) {
             vertex=queue.poll();//D
            for(Vertex v :getNeighbors(vertex)){
                if(!visited.contains(v)){
                    queue.add(v);
                    visited.add(v);
                }
            }
        }
        return visited;
    }
}


