package trees;

import java.util.ArrayList;


public class binaryTree {
    node root;

    public binaryTree() {
        this.root = null;
    }



    ArrayList postOrder_result=new ArrayList();
    public void depthTreePreOrder(node node){
        if(node==null){
          return ;
        }
        System.out.print(node.getValue() + " ");
        depthTreePreOrder(node.leftNode);
        depthTreePreOrder(node.rightNode);

    }
    public void depthTreeInOrder(node node){
        if(node==null){
            return;
        }
        depthTreePreOrder(node.leftNode);
        System.out.print(node.getValue() + " ");

        depthTreePreOrder(node.rightNode);

    }
    public ArrayList depthTreePostOrder(node node){

        if(node==null){
            return postOrder_result;
        }
        depthTreePreOrder(node.leftNode);
        depthTreePreOrder(node.rightNode);
        System.out.print(node.getValue() + " ");
        postOrder_result.add(node.getValue());
        return postOrder_result;
    }
    void depthTreePreOrder() { depthTreePreOrder(root);
    }
    void depthTreeInOrder() { depthTreeInOrder(root); }
    ArrayList depthTreePostOrder() { depthTreePostOrder(root);
        return postOrder_result;
    }
    }

