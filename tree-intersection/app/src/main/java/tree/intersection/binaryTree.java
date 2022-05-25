package tree.intersection;

public class binaryTree {
    treeNode root;
    boolean result = false;

    binaryTree() {
        this.root = null;
    }

    public void Add(int value) {
        root = insertUsingRecursive(root, value);
    }

    public treeNode insertUsingRecursive(treeNode root, int value) {
        if (root == null) {
            root = new treeNode(value);
            return root;
        }
        if (value < root.getValue()) {
            root.leftNode = insertUsingRecursive(root.leftNode, value);
        } else if (value > root.getValue()) {
            root.rightNode = insertUsingRecursive(root.rightNode, value);
        }
        return root;
    }

}
