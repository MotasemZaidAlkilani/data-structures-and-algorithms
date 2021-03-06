/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linked.list;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test void LinkedList() {
        LinkedList new_Linked_List=new LinkedList();
        new_Linked_List.insert(10);
        assertEquals(10,new_Linked_List.head.value,"The head property will properly point to the first node in the linked list");
        new_Linked_List.insert(20);
        new_Linked_List.insert(30);
        new_Linked_List.insert(40);
        new_Linked_List.insert(50);
        assertEquals(true,new_Linked_List.includes(20));
        assertEquals(false,new_Linked_List.includes(60));
        String linkedList_values="{50} -> {40} -> {30} -> {20} -> {10} -> NULL";
        assertEquals(linkedList_values,new_Linked_List.toString());
    }
}
