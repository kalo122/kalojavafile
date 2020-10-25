package myjavacourse2020;

import java.util.Scanner;

public class IFElseclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Scanner in = new Scanner(System.in);
  System.out.println("plesae enter the number:");
  int value = in.nextInt();
  
  if
	  (value%2==0 && value>0) {
  System.out.println("postive even number");
  }
  else if ( value%2!=0 &&  value>0){
  System.out.println("postive odd number");
  }
  else if ( value%2==0 && value <0){
  System.out.println("Negative even number");
  }
  else if(value%2!=0 &&  value < 0){
	   System.out.println("negative odd number");
	  }
  else {
	  System.out.println("wrong number");
  }
  
		
	}

}
