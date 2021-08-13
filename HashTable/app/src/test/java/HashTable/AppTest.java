/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package HashTable;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void appHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull(classUnderTest.getGreeting(), "app should have a greeting");
    }
    @Test
    void testHashMap(){
        HashTable<Object, Integer> salary = new HashTable<Object, Integer>();
        salary.add("John", 300);
        salary.add("Sally", 400);
        salary.add("Jade", 100);
        System.out.println("Delete Sally => " + salary.remove("Sally"));
        System.out.println("The size is => " + salary.getSize());
        assertTrue(salary.getSize()==2);
    }
}