package Bridgelabz;

/**
 * Linkedlist
 */
public class Linkedlist {
    Node head;
    class Node {
        Object data;
        Node next;
        Node(Object data) {
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

//Uc4 = Insert the elements in between LinkedList.
public void insertInMiddle(Object place, Object data) { // Insert 30 in between 36 and 70.
    Node newNode = new Node(data);
    Node temp = head;
    while (temp.data != place) {  //traverse till the data after we have to add New Node.
        temp = temp.next;
    }
    newNode.next = temp.next;     //Insert a number in middle of two numbers.
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
    list.insertInMiddle(85,16);
    list.print();
}
}