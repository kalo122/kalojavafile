package myjavacourse2020;

import java.util.Iterator;
import java.util.Stack;

public abstract class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Stack<String>stack= new Stack();
	
     stack.push("Yared");
     stack.push("Bereket");
     stack.push("Tade");
	 stack.push("Liyu");
	 //System.out.println(stack.pop());
	 //System.out.println(stack.pop());
      stack.pop(); // pop = remove data from stack
      stack.pop();
	 
      System.out.println(stack.peek());
	 Iterator it = stack.iterator();
	 
	 while(it.hasNext()) {
		 System.out.println(it.next());
	 }
		 
	
	

}
}
