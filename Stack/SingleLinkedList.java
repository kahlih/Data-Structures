import java.util.*;

class Node {
    private int data;
    public Node next;

    /* Creates a New Node Construct*/
    public Node(int dataItem) {
        data = dataItem;
    }

    public int data(Node n){
        return n.data;
    }

    /* Helper function to see data attributes of Node*/
    public void displayNode() {
        System.out.print("[" + data + "], ");
    }
}

class LinkedList {
    Node head;
    int size;

    /* Creates the Linked List Structure */
    public LinkedList(){
        head = null;
        size = 0;

    }

    /* Inserts Nodes at the Front of a List*/
    public void insertFront(int dataItem) {
        Node newNode = new Node(dataItem);
        newNode.next = head;
        head = newNode;
        size++;

    }

    public Node getNode(int dataItem){

        Node current = head;
        while(current != null)
        {
            if(current.data(current) == dataItem)
                return current;
            current = current.next;
        }
        return null;

    }

    /* Adds an Entry after a given Node */
    public void insert(int dataItem, Node n){
        Node newNode = new Node(dataItem);
        newNode.next = n.next;
        n.next = newNode;

    }

    /* Deletes Nodes at the Front of a List*/
    public Node deleteFront(){
        Node temp = head;

        // Moves pointer of head to next node in the list
        if (head != null)
            head = head.next;

        if (temp != null)
            return temp;
        else
            return null;

    }

    /* Helper Function that Displays inner Nodes of List */
    public void displayList(){
        Node current = head;

        System.out.println("Items in List: ");
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println();

    }


}

public class SingleLinkedList {

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.insertFront(35);
        list.displayList();

        list.insertFront(44);
        list.displayList();

        list.insertFront(22);
        list.displayList();

        list.insertFront(1);
        list.displayList();

        Node n = list.getNode(44);
        list.insert(1717,n);
        list.displayList();

        Node t = list.deleteFront();
        list.displayList();

    }
}
