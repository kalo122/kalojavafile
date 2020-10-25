package myjavacourse2020;

class EmpInfo {
	

public static String city = "New York";
public String name = "Mesay Madebo";
public int age = 32;

}

public class Staticclassmain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// System.out.println("city:" + EmpInfo.city);
// System.out.println("name:" + EmpInfo.name);
// System.out.println("age:" + EmpInfo.age);
	
	    EmpInfo mcc1 = new EmpInfo();
	    EmpInfo.city = "Addis Abeba";
	    mcc1.name = "Hailu";
	    mcc1.age = 27;
	    
	    System.out.println("city:" + mcc1.city);
	    System.out.println("name:" + mcc1.name);
	    System.out.println("age:" + mcc1.age);
	    
	    
	EmpInfo mcc2 = new EmpInfo();
	// mcc2.city = "sodo";
	// mcc2.name = "kalo";
	// mcc2.age = 33;
	
	System.out.println("city:" + mcc2.city);
    System.out.println("name:" + mcc2.name);
    System.out.println("age:" + mcc2.age);
	
	
	}
	
	
	

}
