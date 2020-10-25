package myjavacourse2020;
class CalculationClass{
	
	public void Add(int a, int b) {
		System.out.println("the sum of two mumbers:" + (a +b));
	}
	public void sub(int a, int b) {
		System.out.println("the subtraction of two mumbers:" + (a -b));
}
}

public class MyCalculationClass extends CalculationClass {
	
	public void multi(int a, int b) {
		System.out.println("the product of two mumbers:" + (a *b));
	}



public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	
	CalculationClass m2 = new CalculationClass();
	m2.Add(78, 89);
	m2.sub(67, 54);
	

	MyCalculationClass m1 = new MyCalculationClass();
	
	m1.Add(50, 90);
	m1.sub(90, 50);
	m1.multi(50, 90);
	
	}

}
