package myjavacourse2020;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

public class EmployeeMain2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> list = new ArrayList();
		
		 
		Employee emp2 = new Employee();
		emp2.setEmpId(11);
		emp2.setEmpName("Helen");
		emp2.setEmpsalary(11000);
		
		list.add(emp2);
		
		Employee emp3 = new Employee();
		emp3.setEmpId(12);
		emp3.setEmpName("Dani");
		emp3.setEmpsalary(9000);
		
		list.add(emp3);
		
		Employee emp4 = new Employee();
		emp4.setEmpId(13);
		emp4.setEmpName("Eminet");
		emp4.setEmpsalary(20000);
		
		list.add(emp4);
		
  for (Employee e:list){
		
  System.out.print("EmployeID: " + e.getEmpId()+ ", EmployeeName: " + e.getEmpName()+ " , EmployeeSalary:" + e.getEmpsalary()); 
	System.out.println();		
		}
		
   // Set b = list.entrySet();
	//Iterator it = b list.iterator();
	
	//while(it.hasNext()) {
	//System.out.println(it.next()+ ",");
	
		
		
	}
	
		

		
		
		
		
	}



