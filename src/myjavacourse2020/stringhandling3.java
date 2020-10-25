package myjavacourse2020;

public class stringhandling3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str7 = "today is Sunday. Tommorow is monday";
		int loc = str7.indexOf("Tommorow");
		System.out.println(loc);
		
	String str8 = str7.substring(9, 15);
	System.out.println(str8);
		
	
	
	String str9 = "today is Sunday. Tommorow is monday";
		String[]arr = str9.split("  ");
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
	}

}
