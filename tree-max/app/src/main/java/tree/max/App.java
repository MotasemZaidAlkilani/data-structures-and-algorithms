/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.max;

public class App {


    public static void main(String[] args) {
     binaryTree tree=new binaryTree();
     tree.root=new node(11);
     tree.root.leftNode=new node(2);
     tree.root.rightNode=new node(3);
     tree.root.leftNode.leftNode=new node(6);
     tree.root.leftNode.leftNode.leftNode=new node(4);
     tree.root.leftNode.rightNode=new node(5);
     System.out.println(tree.find_maximum_value());
    }
}