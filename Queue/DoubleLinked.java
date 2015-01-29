import java.util.*;

class Node{
    int data;
    Node next;
    Node prev;

    public Node(int dataItem){
        data = dataItem;
    }

    public void displayNode() {
        System.out.print("[" + data + "], ");
    }
}

class DoubleLinkedList {
    Node first;
    Node last;
    int size;

    public DoubleLinkedList() {
        first = null;
        last = null;
    }

    public boolean isEmpty(){
        return first == null;
    }

    public void insertFront(int dataItem) {

        Node elem = new Node(dataItem);

        if(isEmpty())
            last = elem;
        else
            first.prev = elem;
        elem.next = first;
        first = elem;
        /*elem.next = first.next;
        elem.prev = first;
        first.next.prev = elem;*/
    }

    public void insertBack(int dataItem) {
        Node elem = new Node(dataItem);

        if (isEmpty())
            first = elem;
        else{
            last.next = elem;
            elem.prev = last;
        }
        last = elem;
        /*elem.next = last;
        last.prev = elem;
        last.prev.next = elem;*/
    }

    public Node deleteFront(){
        if (isEmpty()){
            return null;
        }

        Node temp = first;
        first = first.next;
        return temp;

    }

    /* Helper Function that Displays inner Nodes of List */
    public void displayList() {
        Node current = first;

        System.out.println("Items in List: ");
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
    }
}

public class DoubleLinked {

    public static void main(String[] args) {

        DoubleLinkedList list = new DoubleLinkedList();

        list.insertFront(1);
        list.displayList();
        list.insertFront(12);
        list.insertFront(123);
        list.insertFront(1234);
        list.insertFront(12345);
        list.displayList();

        list.insertBack(6);
        list.insertBack(678);
        list.displayList();

        list.deleteFront();
        list.displayList();

    }
}
