package myjavacourse2020;

interface Animals {
	 void eat();
	void travel();
	
}
interface Amphibians{
	void swim();
}

class Mammals implements Animals, Amphibians {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Mammals eats");
	}

	@Override
	public void travel() {
		// TODO Auto-generated method stub
		System.out.println("Mammals travels");
	}
	
	


public int nooflegs(int legs) {
	
	return legs;
}

@Override
public void swim() {
	// TODO Auto-generated method stub
	System.out.println("Amhibians swims");
}
}
   public class Interfaceclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Mammals m = new Mammals();
		   m.eat();
		   m.travel();
		   m.swim();
 System.out.println("Mammals have " + m.nooflegs (4) + " legs" );

		
		
	}


}
   
