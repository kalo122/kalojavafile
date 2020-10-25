package myjavacourse2020;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileSystemclass3{

	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub

		String line = null;
		FileReader fr = new FileReader("C:\\Users\\mesay w. madebo\\Desktop\\file\\input.txt");
		
		BufferedReader bf = new BufferedReader(fr);
		{
		while((line= bf.readLine())!= null){
			System.out.println(line);
			
		}
		bf.close();
		}
	


		
}


}