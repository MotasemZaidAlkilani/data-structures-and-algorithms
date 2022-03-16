package queueAndStack;

public class stackNode {
    int value=0;
    private stackNode next;
    public stackNode(int value){
        this.value=value;

    }
    public  void setNext(stackNode next) {
        this.next = next;
}
    public stackNode getNext() {
        return next;
    }
}
