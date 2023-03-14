package Bridgelabz;

/**
 * Linkedlist
 */
public class Linkedlist {
    Node head;
    class Node {
        Object data;
        Node next;
        Node(Object data) {deleteLast
            this.data = data;
            this.next = null;
        }
    }
   //Uc3 = Create Linked list by using Append or AddLast method.
   public void AddLast(Object data) {
    Node newNode = new Node(data); // create object of Node and pushing data.
    if (head == null) {
        head = newNode;     // if linkedList is empty then new node will be head.
        return;
    }
    Node temp = head;
    while (temp.next != null) {
        temp = temp.next;  // traversing the temp till end of the list.
    }
    temp.next = newNode;   // adding node at end of the list.
}

//Uc9 = search a number in linked list and delete it.
public void deleteSearched(Object data) {
    Node newNode = new Node(data);  //Entered Previous element to delete next.
    Node temp = head;
    while (temp.data != data) {
        temp = temp.next;
    }
    temp.next = temp.next.next;
}
public void size(){   // claculate size of linked list.
    int size = 0;
    Node temp = head;
    while (temp != null) {
        temp = temp.next;
        size++;
    }
    System.out.println("Size ="+size);
}

// Display the methods.
public void print() {
    if (head == null) {
        System.out.println("Linked List is Empty.");
        return;
    }
    Node temp = head;        // taking temp as a temporary variable to keep head as a constant.
    while (temp != null) {

        System.out.print(temp.data + " => "); // It will print all the data in the list.
        temp = temp.next;
    }
    System.out.println("Null");
}
public static void main(String[] args) {
    LinkedList list = new LinkedList();
    list.AddLast(85);
    list.AddLast(24);
    list.AddLast(16);
    list.AddLast(38);
    list.deleteSearched(16);
    list.size();
    list.print();
}
}
