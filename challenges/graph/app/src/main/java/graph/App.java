/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import java.util.List;
import java.util.Objects;

public class App {
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
    private Integer totalCost = 0;

    public Integer businessTrip(Graph graph, List<String> cities){
        totalCost = 0;
        int citiesSize = cities.size();

        for (int i = 0; i < citiesSize; i ++){
            if (i + 1 >= citiesSize){
                break;
            }
            helperTrip(cities.get(i), cities.get(i + 1), graph);
        }
        return totalCost;
    }
    private void helperTrip(String city1, String city2, Graph graph){
        if (graph.getNeighbors(city1) == null){
            return;
        }
        for (Vertex vertex: graph.getNeighbors(city1)) {
            if (Objects.equals(city2, vertex.label)) {
                totalCost += vertex.weight;
                break;
            }
        }
    }

    }
