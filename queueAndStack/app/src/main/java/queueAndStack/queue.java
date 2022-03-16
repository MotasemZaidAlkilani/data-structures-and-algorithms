package queueAndStack;

import java.util.EmptyStackException;

public class queue {
   private queueNode front;
    private queueNode rear;

    public queue(){
       front=null;
       rear=null;
   }
   public boolean isEmpty(){
        return rear==null;
   }
   void enqueue(int value){
   queueNode node=new queueNode(value);
   if(this.rear==null){
       this.front=this.rear=node;

   }
   else{
       this.rear.setNext(node);
       this.rear = node;
   }
   }
   void dequeue(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        if(this.front==null){}

            queueNode node=this.front;
            this.front=node.getNext();

       if (this.front == null)
           this.rear = null;
   }
   public int  peek(){
        if (isEmpty()){
            return -1;
        }
        return getFront();
   }


    public int getFront() {
        if(this.front!=null)
        return front.value;


        return 0;
    }

    public int getRear() {
        if(this.rear!=null)
        return rear.value;

        return 0;
    }
}
