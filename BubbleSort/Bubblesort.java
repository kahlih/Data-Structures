import java.util.*;
import java.io.*;

public class Bubblesort{

	public static void main(String[] args)throws IOException{

		LinkedList list = new LinkedList();
		list.populate(); // function added in SingleLinkedList.java

		list.displayList();
		list.bsort(); // function added in SingleLinkedList.java
		list.displayList();

	}
}