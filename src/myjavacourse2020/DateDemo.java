package myjavacourse2020;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date date = new Date();
		
		System.out.println("Current Date:" +date.toString());
		
		System.out.println("............................................................................................");
		
		
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    String strdate = sdf.format(date);
	
	System.out.println("Current Date:"  + strdate);	
System.out.println(".....................................................................................................");

SimpleDateFormat sdf2 = new SimpleDateFormat(" hh:mm:ss");
String strtime = sdf2.format(date);
System.out.println("Current time" +strtime);
System.out.println("......................................................................................................");

SimpleDateFormat sdf3  = new SimpleDateFormat("dd-MM-yyyy");
sdf.setLenient(false);
String input = "03-02-2018";
System.out.println("Given date:" + input);

try {
	Date dt = sdf.parse(input);
	System.out.println(input);
}
	
	catch(ParseException ex) {
		
	System.out.println(ex.getMessage());
    System.out.println("Invalid Date:" + input);
    
    System.out.println(".................................................................................................");
    SimpleDateFormat sdf4 = new SimpleDateFormat("dd-MM-yyyy");
    sdf.setLenient(false);
    String str1 = "12-02-2018";
    String str2 = "12-02-2018";
    try {
    	Date d1 = sdf4.parse(str1);
    	Date d2 = sdf4.parse(str2);
    
    	System.out.println(d2.compareTo(d1));
    }
    	catch(Exception e){ 
    		System.out.println("Invalid date:" + e.getMessage());
    		
    	}
    		
    	}
    	
    
    
    
	}

		
	}
			








