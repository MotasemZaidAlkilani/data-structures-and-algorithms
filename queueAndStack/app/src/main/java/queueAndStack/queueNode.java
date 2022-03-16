package queueAndStack;

public class queueNode {
    int value=0;
    private queueNode next;
    public queueNode(int value){
        this.value=value;

    }
    public  void setNext(queueNode next) {
        this.next = next;
    }
    public queueNode getNext() {
        return next;
    }
}
