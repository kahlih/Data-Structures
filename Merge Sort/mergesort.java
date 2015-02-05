import java.util.*;
import java.io.*;

public class mergesort {
	public static void main(String[] args)throws IOException{
		LinkedList list = new LinkedList();
		list.populate();

		list.displayList();
		list.mergesort();
		list.displayList();
	}
}