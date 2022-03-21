package stack.queue.animal.shelter;

public class animal {
    String type;
    animal next;
    public animal(String type){
        if(type=="cat"||type=="dog")
        this.type=type;
        else
        this.type=null;


    }

}
