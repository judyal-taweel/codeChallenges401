/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    public void addNode(){
        Graph graph = new Graph();

        graph.addVertex("judy");
        graph.addVertex("bataineh");

        assertNotNull(graph.getVertices());
        assertEquals(2, graph.getVertices().size());
        assertTrue(graph.getVertices().contains(new Vertex("judy")));
    }

    @Test
    public void addEdge(){
        Graph graph = new Graph();

        graph.addVertex("judy");
        graph.addVertex("bataineh");

        graph.addEdge("judy","bataineh");

        assertNotNull(graph.getVertices());
        assertEquals(2, graph.getVertices().size());
        assertTrue(graph.getNeighbors("judy").contains(new Vertex("bataineh")));
        assertTrue(graph.getNeighbors("bataineh").contains(new Vertex("judy")));
    }

    @Test
    public void allNodes(){
        Graph graph = new Graph();

        graph.addVertex("judy");
        graph.addVertex("bataineh");
        graph.addVertex("bataineh2");

        assertEquals(3, graph.getVertices().size());
        assertTrue(graph.getVertices().contains(new Vertex("judy")));
        assertTrue(graph.getVertices().contains(new Vertex("bataineh")));
        assertTrue(graph.getVertices().contains(new Vertex("bataineh2")));
        assertFalse(graph.getVertices().contains(new Vertex("altaweel")));
    }

    @Test
    public void nodeNeighbors(){
        Graph graph = new Graph();

        graph.addVertex("judy");
        graph.addVertex("bataineh");

        graph.addEdge("judy","bataineh");

        assertEquals(1, graph.getNeighbors("judy").size());
        assertTrue(graph.getNeighbors("judy").contains(new Vertex("bataineh")));
        assertTrue(graph.getNeighbors("bataineh").contains(new Vertex("judy")));
    }

    @Test
    public void nodeNeighborsWeight(){
        Graph graph = new Graph();

        graph.addVertex("judy");
        graph.addVertex("bataineh");
        graph.addVertex("altaweel");

        graph.addEdge("judy","bataineh",3);
        graph.addEdge("judy","altaweel",2);

        assertEquals(2, graph.getNeighbors("judy").size());
        assertEquals(3, graph.getNeighbors("judy").get(0).weight);
        assertEquals(2, graph.getNeighbors("judy").get(1).weight);
//    assertTrue(graph.getNeighbors("Mahmoud2").contains(new Vertex("Mahmoud")));
    }

    @Test
    public void emptyGraph(){
        Graph graph = new Graph();

        assertNull(graph.getNeighbors("judy"));
    }

    @Test
    public void oneNodeOneEdge(){
        Graph graph = new Graph();
        graph.addVertex("judy");
        graph.addEdge("judy","judy");

        System.out.println(graph.getNeighbors("judy"));

        assertEquals(2, graph.getNeighbors("judy").size());
        assertTrue( graph.getNeighbors("judy").contains(new Vertex("judy")));
        assertEquals(1, graph.getVertices().size());

    }

    @Test

    public void testBusinessTrip(){
        App app = new App();
        Graph citiesGraph = new Graph();
        citiesGraph.addVertex("Pandora");
        citiesGraph.addVertex("Arendelle");
        citiesGraph.addVertex("Metroville");
        citiesGraph.addVertex("Monstroplolis");
        citiesGraph.addVertex("Narnia");
        citiesGraph.addVertex("Naboo");

        citiesGraph.addEdge("Pandora","Arendelle",150);
        citiesGraph.addEdge("Arendelle","Metroville",99);
        citiesGraph.addEdge("Arendelle","Monstroplolis",42);
        citiesGraph.addEdge("Metroville","Narnia", 37);
        citiesGraph.addEdge("Metroville","Pandora", 82);
        citiesGraph.addEdge("Metroville","Naboo", 26);
        citiesGraph.addEdge("Monstroplolis","Metroville", 105);
        citiesGraph.addEdge("Monstroplolis","Naboo", 73);
        citiesGraph.addEdge("Naboo","Narnia", 250);

        List<String> citiesArr = new ArrayList<>();
        citiesArr.add("Metroville");
        citiesArr.add("Pandora");

        List<String> citiesArr2 = new ArrayList<>();
        citiesArr2.add("Arendelle");
        citiesArr2.add("Monstroplolis");
        citiesArr2.add("Naboo");


        List<String> citiesArr3 = new ArrayList<>();
        citiesArr3.add("Naboo");
        citiesArr3.add("Pandora");

        List<String> citiesArr4 = new ArrayList<>();

        assertEquals(82, app.businessTrip(citiesGraph, citiesArr));
        assertEquals(115, app.businessTrip(citiesGraph, citiesArr2));
        assertEquals(0, app.businessTrip(citiesGraph, citiesArr3));
        assertEquals(0, app.businessTrip(citiesGraph, citiesArr4));
    }


    public void testDepthFirstTraverse(){
        App app = new App();
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");
        graph.addVertex("G");
        graph.addVertex("H");

        graph.addEdge("A","D");
        graph.addEdge("A","B");
        graph.addEdge("B","D");
        graph.addEdge("B","C");
        graph.addEdge("C","G");
        graph.addEdge("D","F");
        graph.addEdge("D","H");
        graph.addEdge("D","E");
        graph.addEdge("F","H");

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("G");
        list.add("D");
        list.add("E");
        list.add("H");
        list.add("F");

        Set<String> result = graph.depthFirstTraverse("A");

        assertTrue(result.contains(list.get(0)));
        assertTrue(result.contains(list.get(1)));
        assertTrue(result.contains(list.get(2)));
        assertTrue(result.contains(list.get(3)));
        assertTrue(result.contains(list.get(4)));
        assertTrue(result.contains(list.get(5)));
        assertTrue(result.contains(list.get(6)));
        assertTrue(result.contains(list.get(7)));
    }

}
