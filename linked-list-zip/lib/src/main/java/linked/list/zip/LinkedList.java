package linked.list.zip;

public class LinkedList {
    Node head;
    public LinkedList(){
        this.head=null;
    }
    public void insert(int value){
        Node pointer=this.head;
        if(pointer==null) {
            Node n=new Node(value);
            n.next= this.head;
            this.head=n;
        }
        else{
            while(pointer!=null){
                if(pointer.next==null){
                    Node n=new Node(value);
                    n.next=null;
                    pointer.next=n;
                    break;
                }
                pointer=pointer.next;
            }

        }
}
    public void insert_after(int value,int new_value){
        Node pointer=this.head;
        if(pointer==null) {
            Node n=new Node(new_value);
            n.next= this.head;
            this.head=n;
        }else{
            while(pointer!=null){
                if(pointer.value==value){
                    Node n=new Node(new_value);
                    n.next=pointer.next;
                    pointer.next=n;
                    break;}
                pointer=pointer.next;
            }}}
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
