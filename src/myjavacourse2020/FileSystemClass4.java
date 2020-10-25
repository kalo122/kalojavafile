package myjavacourse2020;

import java.io.FileWriter;


public class FileSystemClass4 {

	public static void main(String[] args){
		// TODO Auto-generated method stub
		
		try
		{
			FileWriter writer = new FileWriter("C:\\Users\\mesay w. madebo\\Desktop\\file2\\output2.txt");
			writer.write("hello world");
			writer.write("\r\n");
			writer.write(" please be fair");
			writer.write("\r\n");
			writer.write(" thanks!!");
			writer.write("kalusha");
	        writer.close();
		  }
	        	
		catch (Exception e){
	        	System.out.println("Error in file writer:" + e.getMessage());
	        }
		
	
		

}

}

