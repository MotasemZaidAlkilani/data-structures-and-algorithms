package stack.queue.animal.shelter;

public class AnimalShelter {
   animal front;
   animal rear;

    public AnimalShelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(animal animal){
        if (animal != null) {


            if (rear == null) {
                this.front = animal;
                this.rear = animal;
            } else {

                this.front = animal;
            }
        }
    }
    public String dequeue(String pref){
        String result=pref;
        animal pointer=this.front;
        while(pointer!=null){
            if(pointer.next==rear){
                this.rear=pointer;
                break;
            }
            pointer=pointer.next;

    }
        if(result=="cat"&&result!="dog"||result!="cat"&&result=="dog"){
            return result;
        }
        else{
            return null;
        }
    }
}
