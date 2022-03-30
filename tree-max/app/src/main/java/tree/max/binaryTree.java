package tree.max;

public class binaryTree {
    node root;
    int maximum_value=0;
    public binaryTree() {
        this.root = null;
    }

    public Integer find_maximum_value(node node){
        if(node==null){
            return maximum_value;
        }
        if(maximum_value< node.getValue()){
            maximum_value=node.getValue();
        }

        find_maximum_value(node.leftNode);
        find_maximum_value(node.rightNode);
        return maximum_value;
    }
    Integer find_maximum_value(){ find_maximum_value(root);
    return maximum_value;
    }
}
