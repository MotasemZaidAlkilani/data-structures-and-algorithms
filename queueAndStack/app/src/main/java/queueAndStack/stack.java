package queueAndStack;

import java.util.EmptyStackException;

public class stack {
    private stackNode top;
    public stack() {
        top = null;
    }
    public boolean empty() {
        return top == null;
    }

    public stackNode push (int value){
        stackNode node=new stackNode(value);
        if(empty()){
           top=node;
           return node;
        }
        else{
            node.setNext(top);
            top=node;
            return node;
        }

    }
    public void pop(){
        if(empty()){
            throw new EmptyStackException();
        }
        stackNode pointer=top;
        top=pointer.getNext();
    }
    public int peek(){
        if(empty()){
           return -1;
        }
        return top.value;
    }
    @Override
    public String toString() {
        // TODO: 3/15/22 print all nodes of the stack
        stackNode pointer = top;
        String result="Stack={";
        while (pointer != null) {
             if(pointer.getNext()!=null){
            result=result+pointer.value +
                    ',';}
             else{
                 result=result+pointer.value +
                         '}';
             }
            pointer=pointer.getNext();
        }
        return result;
    }
}
