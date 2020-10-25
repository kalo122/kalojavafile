package myjavacourse2020;

import java.util.Scanner;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Scanner input = new Scanner(System.in);
 
 System.out.println("enter the name:");
 String name = input.nextLine();
 
 System.out.println("enter the salary:");
 int salary = input.nextInt();
 
 System.out.println("enter the bonus:");
 int bonus = input.nextInt();
 
 System.out.println("total salary:");
 int total_salary = salary + bonus;
 
 System.out.println("name of employe:" + name );
	System.out.println("salary of empl:"+ salary);
	System.out.println("bonus of emppl:"+ bonus);
	System.out.println("total salary of empl:" + total_salary);

	}

}
