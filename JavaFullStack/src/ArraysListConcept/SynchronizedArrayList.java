package ArraysListConcept;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class SynchronizedArrayList {

	public static void main(String[] args) {
		
		//1 : Collections.synchronizedList() - method:
		List<String> namesList = Collections.synchronizedList(new ArrayList<String>());
		namesList.add("Java");
		namesList.add("Python");
		namesList.add("Ruby");
		
		//add, remove - we dont need explicit synchronization
		
		//to fetch/traverse the  values from this list -- we have to use explicit synchronization
		
		synchronized (namesList) {
			Iterator<String> it = namesList.iterator();
			 while(it.hasNext()) {
				 System.out.println(it.next());
			 }
		}
		
		//2. copyOnWriteArrayList -- it is a class: Thread-safe/synchronization already.
		CopyOnWriteArrayList<String> empList = new CopyOnWriteArrayList<String>();
		empList.add("Tom");
		empList.add("Steve");
		empList.add("John");
		
		//We dont need explicit synchronization for any operation:
		
		Iterator<String> it = empList.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
