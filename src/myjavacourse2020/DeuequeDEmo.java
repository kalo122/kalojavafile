package myjavacourse2020;


import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Queue;

public class DeuequeDEmo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<String>queue = new ArrayDeque();
		 
		 
		 queue.add("Yared");
		 queue.add("Bereket");
	     queue.add("Tade");
	     queue.add("Liyu");
	     
	    // Iterator<String> it = queue.iterator();
	     
	    // while(it.hasNext()) {
	    	// System.out.println(it.next());
	     
	    for( String str: queue) {
	    	 System.out.println(str);
	     }
	     
		
		
	}

}
