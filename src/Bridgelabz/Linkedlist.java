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

//Uc8 = search 30 in linkedList and add 40 after it.
public void insertSearched(Object place, Object data) {
    Node newNode = new Node(data);
    Node temp = head;
    while (temp.data != place) {  //search after which value you have to entered new node.
        temp = temp.next;           //place = a value after you have to add new node
    }                               //data = new vale.
    newNode.next = temp.next;
    temp.next = newNode;

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
    list.insertSearched(24,38);
    list.print();
}
}