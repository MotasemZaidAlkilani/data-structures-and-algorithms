/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph.business.trip;

public class App {

    public static void main(String[] args) {

    }

    public static int busniess_trip(graph graph, String[] array) {
        boolean condition = true;
        Vertex prevoiusValue = null;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (graph.getAdjVertices().containsKey(new Vertex(array[i]))) {
                if (prevoiusValue != null) {
                    if (graph.getNeighbors(prevoiusValue).contains(new Vertex(array[i]))) {
                        sum = sum + graph.getAdjVertices().get(prevoiusValue).get(new Vertex(array[i]));
                    } else {
                        condition = false;
                        break;
                    }

                }
                prevoiusValue = new Vertex(array[i]);
            } else {
                condition = false;
                break;
            }
        }
        if (condition) {
            return sum;
        } else {
            return 0;
        }
    }
}
