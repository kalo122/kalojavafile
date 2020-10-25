package myjavacourse2020;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FilesystemClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
		
		
		
			FileInputStream in = new FileInputStream("C:\\Users\\mesay w. madebo\\Desktop\\File\\input.txt");
			FileOutputStream out = new FileOutputStream("C:\\Users\\mesay w. madebo\\Desktop\\File\\output.txt");
		
			int c;
			while((c =in.read())!= -1) {
				out.write(c);}
				
			
			out.close();
			

		} catch(IOException e) {
			System.out.println("Error on file read/write:" + e.getMessage());
		}
	
		
	
}
}