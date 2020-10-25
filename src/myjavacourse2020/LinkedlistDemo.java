package myjavacourse2020;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedlistDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<String> al = new LinkedList();
		
		al.add("kalo");
		al.add("leno");
		al.add("ronaldinho");
		al.add("figo");
		//al.add(0,"Hela");
		al.set(0, "Hella");
		//al.contains("hela");
		
		
		
		Iterator itr = al.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
	}

}
