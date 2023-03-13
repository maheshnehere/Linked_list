package Bridgelabz;

/**
 * Linkedlist
 */
public class Linkedlist {
    public class  LinkedList<V extends Comparable<V>> {
        Node<V> head;
        class Node<V> {
            V data;
            Node<V> next;
            Node(V data) {
                this.data = data;
                this.next = null;
            }
        }
    
    }
}