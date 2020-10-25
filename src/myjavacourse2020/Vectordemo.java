package myjavacourse2020;

import java.util.Vector;

import javax.swing.text.html.HTMLDocument.Iterator;

public class Vectordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

  Vector <String> v = new Vector();
    v.add("Haile");
    v.add("Tsion");
    v.add("Selam");
    v.add("Hana");
    v.add("Firehiowt");
    v.set(1, "Tsega");
    
    	System.out.println(v.get(1));
    	
    	java.util.Iterator<String> it = v.iterator();
    	
		while(it.hasNext())
		{
			System.out.println(it.next());
			
			
		}
	}

}
