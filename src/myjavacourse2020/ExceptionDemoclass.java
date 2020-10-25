package myjavacourse2020;

public class ExceptionDemoclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			String val = "abc";
			int number = Integer.parseInt(val);
			System.out.println(number);
			
			
			String name = null;
			System.out.println(name.length());
			
			
			int []arr = new int [4];
			  arr[4]= 23;
			System.out.println(arr[4]);
			
			
	int num = 10/0;
	System.out.println(num);
		}
	
	catch(ArithmeticException e) {
		System.out.println(e);
	}
		
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
	catch(java.lang.NullPointerException e) {
		System.out.println(e);
	}
	catch(NumberFormatException e) {
		System.out.println(e);
	}
		catch(Exception e) {
		}
		finally {
			System.out.println("hello world");
		}
	}
	}

