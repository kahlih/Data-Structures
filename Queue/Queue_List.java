import java.util.*;

class Queue{
	DoubleLinkedList q;

	public Queue() {
		q = new DoubleLinkedList();
	}

	public void insert(int dataItem) {
		q.insertBack(dataItem);
	}

	public Node remove() {
		return q.deleteFront();
	}

	public void displayQueue(){
        Node current = q.first;

        System.out.println("First in First Out ");
        System.out.println("First Item inserted displayed farthest right");
        System.out.println("Reading Left to Right: ");
        while (current != null) {
            current.displayNode();
            current = current.next;
        }
        System.out.println();
	}

}

public class Queue_List {
	public static void main(String[] args){

		Queue myQueue = new Queue();
		myQueue.insert(56);
		myQueue.displayQueue();
		myQueue.insert(44);
		myQueue.displayQueue();
		myQueue.insert(77);
		myQueue.displayQueue();
		myQueue.insert(1234);
		myQueue.displayQueue();

		myQueue.remove();
		myQueue.displayQueue();
	}
}