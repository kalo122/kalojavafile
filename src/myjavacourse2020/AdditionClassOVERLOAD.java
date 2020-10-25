package myjavacourse2020;

public class AdditionClassOVERLOAD {

	public int add(int a,int b){
	    return a+b;
}
  public int add(int a, int b, int c){
  return  a+b+c;
  }
public double add (int a, double b){
return a+ b;
}
public double add (double a, double b, int c){
	return a+b+c;	
}
	public double add(double a, double b, double c){
		return a+b+c;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		AdditionClassOVERLOAD ass = new AdditionClassOVERLOAD();
		int sum1 =ass.add(10, 12);
		int sum2 =ass.add(12, 10, 8);
		double sum3 =ass.add(10, 12.4);
		double sum4 =ass.add(20, 10, 13.5);
		double sum5 =ass.add(10.5, 10.5, 12.2);
		 System.out.println("add of two integers:" + sum1);
		 System.out.println("add of three integers:" + sum2);
		 System.out.println("add of inte and double:" + sum3);
		 System.out.println("add of three integers:" + sum4);
		 
	}

	}
