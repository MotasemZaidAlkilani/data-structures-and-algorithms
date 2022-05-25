package tree.intersection;

public class treeNode {
    private int value;
    treeNode leftNode;
    treeNode rightNode;

    public treeNode(int value) {
        this.value = value;
        leftNode = rightNode = null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
