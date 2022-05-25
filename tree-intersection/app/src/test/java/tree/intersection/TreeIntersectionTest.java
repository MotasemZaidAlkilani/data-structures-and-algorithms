/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.intersection;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class TreeIntersectionTest {
    TreeIntersection mainClass=new TreeIntersection();
    @Test void testWithTwoCommonValues() {
        binaryTree firstTree = new binaryTree();
        binaryTree secondTree = new binaryTree();
        firstTree.Add(100);
        firstTree.Add(200);
        firstTree.Add(300);
        secondTree.Add(150);
        secondTree.Add(200);
        secondTree.Add(300);
        String expected="[200, 300]";
        String actual=mainClass.tree_intersection(firstTree,secondTree).values().toString();
        assertEquals(expected, actual);

    }
    @Test void testWithOneCommonValues() {
        binaryTree firstTree = new binaryTree();
        binaryTree secondTree = new binaryTree();
        firstTree.Add(100);
        firstTree.Add(200);
        firstTree.Add(300);
        secondTree.Add(150);
        secondTree.Add(250);
        secondTree.Add(300);
        String expected="[300]";
        String actual=mainClass.tree_intersection(firstTree,secondTree).values().toString();
        assertEquals(expected, actual);

    }
    @Test void testWithNoCommonValues() {
        binaryTree firstTree = new binaryTree();
        binaryTree secondTree = new binaryTree();
        firstTree.Add(100);
        firstTree.Add(200);
        firstTree.Add(300);
        secondTree.Add(150);
        secondTree.Add(250);
        secondTree.Add(350);
        String expected="[]";
        String actual=mainClass.tree_intersection(firstTree,secondTree).values().toString();
        assertEquals(expected, actual);

    }
}