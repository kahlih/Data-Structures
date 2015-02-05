import java.util.*;
import java.io.*;

class Node {
    public int data;
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
        ++size;

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
        ++size;
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

        System.out.println("Items in List, Inserted Last -> First: ");
        while(current != null)
        {
            current.displayNode();
            current = current.next;
        }
        System.out.println();

    }

    /* Populates list with a given file: nums.txt */
    public void populate() throws IOException{

        Scanner scan = new Scanner(new FileReader("numbers.txt"));
        while(scan.hasNextLine()){
            int n = Integer.parseInt(scan.nextLine().trim());
            
            // Copied from insert
            Node newNode = new Node(n);
            newNode.next = head;
            head = newNode;
            ++size; 

        }

    }

    /* MergeSort Algorithm */
    public void mergesort(){
        if (size != 0)
            split(head,size);
    }

    /* Recursive: Divide list in halves */
    public Node split(Node head, int size){

        /* Base Case */
        if (head == null || head.next == null){
            return head;
        }

        /* Divide List into two halves*/
        else{
            Node half1;
            Node half2;
            Node current = head; 

            for (int i = 0; i < (size/2); ++i){
                current = current.next;
            }

            half2 = current.next;
            current.next = null;
            half1 = head;

            return merge( split(half1, (size/2)) , split(half2, (size - (size/2))) );
        }

    }

    public Node merge(Node h1, Node h2){

        //h1.displayNode();
        //h2.displayNode();

/*        Node newNode = new Node(dataItem);
        newNode.next = head;
        head = newNode;*/

        Node m = null;
        /*if (h1.data < h2.data){
            m = new Node(h1.data);
            h1 = h1.next;
        }
        else{
            m = new Node(h2.data);
            h2 = h2.next;
        }*/

        //m.displayNode();

        while ( h1 != null || h2 != null){
            
            if (h1 == null){
                Node newNode = new Node(h2.data);
                newNode.next = m;
                m = newNode;
                h2 = h2.next;
                m.displayNode();
            }
            else if (h2 == null){
                Node newNode = new Node(h1.data);
                newNode.next = m;
                m = newNode;
                h1 = h1.next;
            }

            else if(h1.data < h2.data ){
                Node newNode = new Node(h1.data);
                newNode.next = m;
                m = newNode;
                h1 = h1.next;
            }
            else{
                Node newNode = new Node(h2.data);
                newNode.next = m;
                m = newNode;
                h2 = h2.next;
            }
        }

        return m;
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
