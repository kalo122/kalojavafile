package myjavacourse2020;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	Map hm = new HashMap();
	hm.put(1, "green");
	hm.put(3, "yelow");
	hm.put(2, "red");
	hm.put(4, "white");
	hm.put(5, "black");
	hm.put(2, "Blue");
	
	
//System.out.println(hm.get(2));
//System.out.println(hm.get(5));

 //Set <Integer>keys = hm.keySet();
 // for(Integer key: keys) {
	//  System.out.println(key);
	  
	  Set se = hm.entrySet();
	  Iterator it = se.iterator();
	  while(it.hasNext()) {
		  
		  Map.Entry me =(Map.Entry)it.next();
		  System.out.print(me.getKey() + " ");
		  System.out.println(me.getValue());
	  }
	
  
	
	
	
	

}
}