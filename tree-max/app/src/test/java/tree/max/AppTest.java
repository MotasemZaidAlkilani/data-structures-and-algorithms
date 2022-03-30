/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.max;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void FirstTest() {
        binaryTree tree=new binaryTree();
        tree.root=new node(1);
        tree.root.leftNode=new node(2);
        tree.root.rightNode=new node(3);
        assertEquals(tree.find_maximum_value(),3);
    }
    @Test void SecondTest() {
        binaryTree tree=new binaryTree();
        tree.root=new node(1);
        tree.root.leftNode=new node(22);
        tree.root.rightNode=new node(3);
        tree.root.rightNode.rightNode=new node(4);
        tree.root.rightNode.leftNode=new node(5);
        assertEquals(tree.find_maximum_value(),22);
    }
    @Test void ThirdTest() {
        binaryTree tree=new binaryTree();
        tree.root=new node(1);
        assertEquals(tree.find_maximum_value(),1);
    }
}
