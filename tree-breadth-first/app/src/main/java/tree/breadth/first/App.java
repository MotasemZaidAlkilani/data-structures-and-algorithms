/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package tree.breadth.first;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

public class App {

    public static void main(String[] args) {
        Tree tree=new Tree();
        tree.root=new node(1);
        tree.root.leftNode=new node(2);
        tree.root.rightNode=new node(3);
        tree.root.leftNode.leftNode=new node(4);
        tree.root.leftNode.rightNode=new node(5);


        System.out.print(breadth_first(tree));
    }
    public static List breadth_first(Tree tree){
        node node=tree.root;
        ArrayList<Integer> result = new ArrayList<>();
        int length=height(node);
        int i;
        for (i = 1; i <= length; i++)
            printCurrentLevel(node, i,result);

            return result;
        }
   public static  void printCurrentLevel(node node,int i,ArrayList<Integer> list){
       if(node==null){
           return ;
       }
       if(i==1){
           list.add(node.getValue());
       }
       else if(i>1){
           printCurrentLevel(node.leftNode, i - 1,list);
       printCurrentLevel(node.rightNode, i - 1,list);
       }

    }
   static  int height(node node)
    {
        if (node == null)
            return 0;
        else {
            int lheight = height(node.leftNode);
            int rheight = height(node.rightNode);

            if (lheight > rheight)
                return (lheight + 1);
            else
                return (rheight + 1);
        }
    }


   }
