package myjavacourse2020;


  class MyClass {

public void methodone(){

int j = 25;

System.out.println("Value of j:"+ j);

}

public void methodtwo(){

int k = 30;

System.out.println("Value of k:"+ k);

//System.out.println("Value of j:"+j);

}
	
}
public class localvariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyClass mc = new MyClass();
		mc.methodone();
		mc.methodtwo();
	}

}
