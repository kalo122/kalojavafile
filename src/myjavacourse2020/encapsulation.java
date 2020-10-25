package myjavacourse2020;

public class encapsulation {
	private String FristName;
	private String LastName;
	private int age;
	private double Salary;
	private double Bonus;

	public String getFristName() {
		return FristName;
	}

	public void setFristName(String fristName) {
		FristName = fristName;
	}

	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return Salary;
	}

	public void setSalary(double salary) {
		Salary = salary;
	}

	public double getBonus() {
		return Bonus;
	}

	public void setBonus(double bonus) {
		Bonus = bonus;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		encapsulation encap = new encapsulation();
		
		encap.setFristName("Mesay");
		encap.setLastName("Madebo");
		encap.setAge(32);
		encap.setSalary(9000.345);
		encap.setBonus(3000.345);
		
		System.out.println("employe frist Name:" + encap.getFristName());
		System.out.println("employe last Name:" + encap.getLastName());
		System.out.println("employe age:" + encap.getAge());
		System.out.println("employe Salary:" + encap.getSalary());
		System.out.println("employe Bonus:" + encap.getBonus());
		
		
		
		
		
		
		
	}

}
