package trees;

public class BinarySearchTree extends binaryTree {
    boolean result=false;
    public void Add(int value){
        root = insertUsingRecursive(root, value);
    }
    public node insertUsingRecursive(node root, int value){
       if(root==null){
    root=new node(value);
    return root;
}
       if(value<root.getValue()){
           root.leftNode=insertUsingRecursive(root.leftNode,value);
       }
       else if(value>root.getValue()){
           root.rightNode=insertUsingRecursive(root.rightNode,value);
       }
       return root;
    }
    public boolean Contains(node root, int value)
    {


        if (root==null ){
            result=false;
            return false;}
        if(root.getValue()==value){
            result=true;
return true;
        }


        if (root.getValue() < value)
            return Contains(root.rightNode, value);


        return Contains(root.leftNode, value);
    }
    boolean Contains(int value) { Contains(root,value);
        return result;
    }

}
