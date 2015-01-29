import java.util.*;

class stack{
	LinkedList s ;

	public stack(){
		s = new LinkedList();
	}

	public void push(int dataItem){
		s.insertFront(dataItem);
	}

	public Node pop(){
		//If there are no items present on stack
		if (s.head == null){
			return null;
		}
		return s.deleteFront();
	}

	public void displayStack(){
		Node current = s.head;

		System.out.println("Top to Bottom: ");
		while(current != null)
		{
			current.displayNode();
			current = current.next;
			System.out.println();
		}
	}

}

public class Stack_List{
	public static void main(String[] args){

		stack myStack = new stack();

		myStack.push(11);
		myStack.push(99);
		myStack.push(17);
		myStack.push(21);

		myStack.pop();
		myStack.displayStack();

	}
}