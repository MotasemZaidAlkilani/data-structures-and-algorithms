package graph;

import java.util.*;

public class Graph {

  private  Map<Vertex,List<Vertex>> adjVertices;


    public Graph() {
        this.adjVertices =new HashMap<>();
    }

    public Vertex addNode(String value){
      Vertex vertex=new Vertex(value);

      adjVertices.put(vertex,new ArrayList<>());

      return vertex;
    }


    public void addEdge(String data1, String data2){
        Vertex vertex1= new Vertex(data1);
        Vertex vertex2= new Vertex(data2);

        if(adjVertices.containsKey(vertex1)&&adjVertices.containsKey(vertex2)) {
            adjVertices.get(vertex1).add(vertex2);
            adjVertices.get(vertex2).add(vertex1);
        }

    }

    public Map<Vertex,List<Vertex>> getAdjVertices() {
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
        return adjVertices.get(vertex);

    }

    public int size(){
        return adjVertices.size();
    }
 public String isEmpty(){
        if(adjVertices.isEmpty()){
            return null;
        }
        else{
            return "not empty";
        }


 }

}
