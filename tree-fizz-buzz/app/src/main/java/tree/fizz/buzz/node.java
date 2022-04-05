package tree.fizz.buzz;

public class node<T> {
    private T value;
    node leftNode;
    node rightNode;

    public node(T value) {
        this.value = value;
        leftNode=rightNode=null;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
