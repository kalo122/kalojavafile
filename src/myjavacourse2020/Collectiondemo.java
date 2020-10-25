package myjavacourse2020;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class Collectiondemo {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Collection values = new ArrayList();
		//List<String> Values = new ArrayList<String>();
	    List values = new ArrayList();
		
		
		values.add(4);
		values.add(6.0);
		values.add(9);
		values.add(9);
		values.add("mesay");
		values.add(2);
		values.add(1);
		values.add(1, "four");
		
		
		//System.out.print(values.get(3));
		//System.out.print(values.get(1));
		
		Iterator it = values.iterator();
		
	      while(it.hasNext())
	{System.out.print(it.next() + " , ");
		
		//for( int i = 0; i<values.size(); i++);{
		//System.out.println(values.getClass(i));
	
		}


}
}
//}

