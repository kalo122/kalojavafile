package myjavacourse2020;



	
	 public class instancevariable {
		 int age =23;
		 static int salary = 200;
		 

		 public void methodone(){

		 int j = 25;

		 System.out.println("Value of j:"+ j);
         System.out.println("age:" + age);
		 }
	 
		 public void methodtwo(){

		 int k = 30;
         
		 System.out.println("Value of k:"+ k);
		 System.out.println("age:"+ age);
         System.out.println(instancevariable.salary =400);
		 //System.out.println("Value of j:"+j);

		 }
		 	
		 
      

		 	public static void main(String[] args) {
		 		// TODO Auto-generated method stub

		 		instancevariable mc = new instancevariable();
		 		mc.methodone();
		 		mc.methodtwo();
		 		System.out.println(mc.age);
		 		System.out.println(mc.age =24);
		 		
		 		instancevariable mc2 = new instancevariable();
		 		System.out.println(mc2.age);
		 		System.out.println(instancevariable.salary);
		 	}
	 }

		 


	
