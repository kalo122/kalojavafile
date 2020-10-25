package myjavacourse2020;

import java.util.Scanner;

public class scanner {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		char a;
		
		
		do
		{
			System.out.println("Pls enter your input: ");
		    int value = in.nextInt();
		    
		    if(value <10 && value>=1) {
				System.out.println("Its a One digit Number");
			}
			else if(value <100 && value>=10) {
				System.out.println("Its a Two digit Number");
			}
			else if (value <1000 && value>=100) {
				System.out.println("Its a Three digit Number");
			}
			else if(value < 10000 && value>=1000) {
				System.out.println("Its a Four digit Number");
			}
			else if(value <100000 && value>=10000) {
				System.out.println("Its a Five digit Number");
			}
			else {
				System.out.println("Number is not between 1 and 99999");
			 
			}
			    
		        System.out.println("Continue(Y/N)");
		         a = in.next().charAt(0);

		} while(a=='Y'|| a=='y');
	}
	
}

		

