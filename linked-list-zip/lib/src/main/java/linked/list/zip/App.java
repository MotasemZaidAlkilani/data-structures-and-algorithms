/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list.zip;

public class App {
  public static void main(String[]args){


  }
public static void zipLists(LinkedList firstLinkedList,LinkedList secondLinkedList){
Node pointerFirst=firstLinkedList.head;
Node pointerSecond=secondLinkedList.head;
while(pointerFirst!=null&&pointerSecond!=null){
firstLinkedList.insert_after(pointerFirst.value,pointerSecond.value);
pointerFirst=pointerFirst.next.next;
pointerSecond=pointerSecond.next;
}

}
}