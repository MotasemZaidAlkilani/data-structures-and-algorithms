/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package trees;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void initEmptyTree() {
        binaryTree tree=new binaryTree();
        assertTrue(tree.root==null);
    }
    @Test void initTreeWithOneNode() {
        binaryTree tree=new binaryTree();
        tree.root=new node(1);
        assertTrue(tree.root.getValue()==1);
    }
    @Test void addLeftAndRightNodesToTree() {
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(10);
        tree.Add(20);
        tree.Add(5);

        assertTrue(tree.root.rightNode.getValue()==20);
        assertTrue(tree.root.leftNode.getValue()==5);

    }
    @Test void preOrder() {
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
        tree.Add(40);
        tree.Add(50);
        tree.depthTreePreOrder();


    }
    @Test void inOrder() {
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
        tree.Add(40);
        tree.Add(50);
        tree.depthTreeInOrder();


    }
    @Test void postOrder() {
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
        tree.Add(40);
        tree.Add(50);
        tree.depthTreePostOrder();


    }
    @Test  void contanisTest(){
        BinarySearchTree tree=new BinarySearchTree();
        tree.Add(10);
        tree.Add(20);
        tree.Add(30);
        tree.Add(40);
        tree.Add(50);
        assertTrue(tree.Contains(10));
        assertTrue(tree.Contains(40));
        assertFalse(tree.Contains(100));
        assertFalse(tree.Contains(330));
    }
}
