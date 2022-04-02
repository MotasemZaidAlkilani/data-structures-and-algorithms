package stack.queue.animal.shelter;



import java.util.ArrayList;


public class AnimalShelter {
   animal front;
   animal rear;
ArrayList<String> list=new ArrayList<>();

    public AnimalShelter() {
        this.front = null;
        this.rear = null;
    }

    public void enqueue(animal animal){
        list.add(0,animal.value);
        if (animal != null) {


            if (rear == null) {
                this.front = animal;
                this.rear = animal;
            } else {
                animal pointer=this.front;
                this.front = animal;
                this.front.next=pointer;
            }
        }
    }
    public String dequeue(String pref){
        String result="none";
        int count=0;
         animal pointer=this.front;
         int j=0;
        while(pointer!=null){
            if(list.get(j)==pref){
                result= list.get(j);
                list.remove(count);
                break;
            }

           j++;
            pointer=pointer.next;
            count++;
    }
return result;
    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "list=" + list +
                '}';
    }
}
