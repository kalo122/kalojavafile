package myjavacourse2020;

public class EmployeeMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

Employee emp = new Employee();
	
	emp.setEmpId(100);
	emp.setEmpName("kalo");
	emp.setEmpsalary(9000);
	
	System.out.println("Employee ID: " + emp.getEmpId() );
	System.out.println("Employee  Name: " + emp.getEmpName() );
	System.out.println("Employee Salary: " + emp.getEmpsalary());
	
	
	System.out.println("Pojo class is the same with Encapsulation but is neat coding");
	System.out.println(" POjo increases readiblity and reusabilty of code plus doesnot have ristrction coz it can be private, public , protected and default  ");
	
	
	
	
	
	
	}
	
	
}
