package linked.list.kth;

public class LinkedList {
    Node head;
    boolean isThereException=false;
    public LinkedList(){
        this.head=null;
    }
    public int kth_from_end(int k){
        Node pointer=this.head;
        int length=0;
        while(pointer!=null){
            length++;
            pointer=pointer.next;
        }
      try {
          pointer = this.head;
          int i = 1;
          boolean condition = true;
          while (condition) {
              if (i == length - k) {
                  condition = false;
                  return pointer.value;
              }
              i++;
              pointer = pointer.next;
          }
      }catch (Exception e){
          isThereException=true;
          System.out.println(e.getMessage());
      }
        return -1;

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
