package linked.list;

public class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void insert(int value){

            Node n=new Node(value);
            n.next=this.head;
            this.head=n;

    }
    public boolean includes(int value){
        Node pointer=this.head;
        boolean result=false;
        while(pointer!=null){

               if(pointer.value==value){
                   result=true;
                   break;
               }

            pointer=pointer.next;
        }
        return result;
    }
    public String toString(){
        Node pointer=this.head;
        String result="";
        while(pointer!=null){

            if(pointer.next!=null){
            result=result+"{"+pointer.value+"} -> ";}
            else{
                result=result+"{"+pointer.value+"} -> NULL";}
            pointer=pointer.next;
        }



       return result;
    }
}
