package myjavacourse2020;

public class stringhandling2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str6 = "567867A5V6";
		  char ch;
		  for(int i = 0;i<str6.length(); i++)
		  {
		       ch = str6.charAt(i);
		       System.out.println(ch);
		       if(Character.isDigit(ch)){
		          continue;
		          }
		        else{
		          System.out.println("String contains NON Digit");
	}

}
}
}