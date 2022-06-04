package graph.business.trip;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class graph {
    private Map<Vertex, Map<Vertex,Integer>> adjVertices;


    public graph() {
        this.adjVertices =new HashMap<>();
    }

    public Vertex addNode(String value){
        Vertex vertex=new Vertex(value);

        adjVertices.put(vertex,new HashMap<>());

        return vertex;
    }


    public void addEdge(String data1, String data2,int weight){
        Vertex vertex1= new Vertex(data1);
        Vertex vertex2= new Vertex(data2);

        if(adjVertices.containsKey(vertex1)&&adjVertices.containsKey(vertex2)) {
            adjVertices.get(vertex1).put(vertex2,weight);
            adjVertices.get(vertex2).put(vertex1,weight);
        }

    }

    public Map<Vertex, Map<Vertex, Integer>> getAdjVertices() {
        return adjVertices;
    }
    public List getNodes(){
        List result=new ArrayList<>();
        for(Vertex vertex :adjVertices.keySet()){
            result.add(vertex.data);
        }
        return result;
    }
    public List<Vertex> getNeighbors(Vertex vertex){
        return adjVertices.get(vertex).keySet().stream().toList();

    }
    public int getWeight(String adjNode){
       return 0;
    }
}
