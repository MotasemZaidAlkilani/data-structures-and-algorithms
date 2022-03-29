package trees;

public class node {
    private int value;
    node leftNode;
    node rightNode;

    public node(int value) {
        this.value = value;
        leftNode=rightNode=null;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
