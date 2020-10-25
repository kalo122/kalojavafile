package myjavacourse2020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List list = new ArrayList();
		 list.add("Lacazete");
		 list.add("Arteta");
		 list.add(3);
		 list.add("Aubumyang");
		 list.add("Saka");
		 
		Iterator itr = list.iterator();
		
		while(itr.hasNext()){
			
			System.out.println(itr.hasNext());
		}
	}

}
