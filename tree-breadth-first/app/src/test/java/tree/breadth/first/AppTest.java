/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.breadth.first;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void testTreeWithThreeValues() {
        App classUnderTest = new App();
        Tree sample=new Tree();
        sample.root=new node(1);
        sample.root.leftNode=new node(2);
        sample.root.rightNode=new node(3);
        String actual=App.breadth_first(sample).toString();
        String expected="[1, 2, 3]";
        assertEquals(expected,actual);

    }
    @Test void testTreeWithFiveValues() {
        App classUnderTest = new App();
        Tree sample=new Tree();
        sample.root=new node(1);
        sample.root.leftNode=new node(2);
        sample.root.rightNode=new node(3);
        sample.root.leftNode.leftNode=new node(4);
        sample.root.rightNode.rightNode=new node(5);
        String actual=App.breadth_first(sample).toString();
        String expected="[1, 2, 3, 4, 5]";
        assertEquals(expected,actual);

    }
    @Test void testHeightMethod() {
        App classUnderTest = new App();
        Tree sample=new Tree();
        sample.root=new node(1);
        sample.root.leftNode=new node(2);
        sample.root.rightNode=new node(3);
        sample.root.leftNode.leftNode=new node(4);
        sample.root.rightNode.rightNode=new node(5);
        int actual=App.height(sample.root);
        int expected=3;
        assertEquals(expected,actual);

    }

}
