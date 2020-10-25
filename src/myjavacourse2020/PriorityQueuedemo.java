package myjavacourse2020;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueuedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Queue queue = new PriorityQueue();
		
		 queue.add("Yared");
		 queue.add("Bereket");
	     queue.add("Tade");
	     queue.add("Liyu");
	     
	    // System.out.println(queue.element());
	    // System.out.println(queue.peek());
	     
	     queue.remove();
	     queue.poll();
	     System.out.println("afer removing two elements");
	     Iterator it = queue.iterator();
	     while(it.hasNext()) {
	    	 System.out.println(it.next());
	     }
		
	}

}
