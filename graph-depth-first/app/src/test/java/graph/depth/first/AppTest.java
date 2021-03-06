/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph.depth.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testWith8VerticesAndEdges() {
        graph sample=new graph();
        sample.addNode("A");
        sample.addNode("B");
        sample.addNode("C");
        sample.addNode("D");
        sample.addNode("G");
        sample.addNode("E");
        sample.addNode("F");
        sample.addNode("H");
        sample.addEdge("F","D");
        sample.addEdge("H","D");
        sample.addEdge("D","E");
        sample.addEdge("D","B");
        sample.addEdge("D","A");
        sample.addEdge("A","B");
        sample.addEdge("B","C");
        sample.addEdge("C","G");
        String excepted="[Vertex{data='A'}, Vertex{data='B'}, Vertex{data='C'}," +
                " Vertex{data='G'}, Vertex{data='D'}, Vertex{data='E'}, Vertex{data='H'}," +
                " Vertex{data='F'}]";
        String actual=sample.depth_first(new Vertex("A")).toString();
        assertEquals(excepted,actual);

    }
    @Test void testWith8VerticesAndEdgesWithDiffernetStart() {
        graph sample=new graph();
        sample.addNode("A");
        sample.addNode("B");
        sample.addNode("C");
        sample.addNode("D");
        sample.addNode("G");
        sample.addNode("E");
        sample.addNode("F");
        sample.addNode("H");
        sample.addEdge("F","D");
        sample.addEdge("H","D");
        sample.addEdge("D","E");
        sample.addEdge("D","B");
        sample.addEdge("D","A");
        sample.addEdge("A","B");
        sample.addEdge("B","C");
        sample.addEdge("C","G");
        String excepted="[Vertex{data='D'}, Vertex{data='A'}, Vertex{data='B'}," +
                " Vertex{data='C'}, Vertex{data='G'}, Vertex{data='E'}, Vertex{data='H'}," +
                " Vertex{data='F'}]";
        String actual=sample.depth_first(new Vertex("D")).toString();
        assertEquals(excepted,actual);

    }

    @Test void testWith4VerticesAndEdges() {
        graph sample=new graph();
        sample.addNode("A");
        sample.addNode("B");
        sample.addNode("C");
        sample.addNode("D");
        sample.addEdge("D","B");
        sample.addEdge("D","A");
        sample.addEdge("A","C");
        sample.addEdge("C","B");
        String excepted="[Vertex{data='D'}, Vertex{data='A'}, Vertex{data='C'}, Vertex{data='B'}]";
        String actual=sample.depth_first(new Vertex("D")).toString();
        assertEquals(excepted,actual);

    }

}
