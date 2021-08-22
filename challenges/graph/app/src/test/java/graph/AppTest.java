/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package graph;

import org.junit.jupiter.api.Test;
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
}
