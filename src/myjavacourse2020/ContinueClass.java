package myjavacourse2020;

public class ContinueClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for(int i=1; i<=10; i++){
		if(i ==7) {
			continue;
		}
				System.out.print( i + " ");
	}
	System.out.println();
	

			for(int j=1; j<=10; j++) {
			
				if(j ==7){
				break;
				}
				System.out.print( j + " ");
		}
	}

}

