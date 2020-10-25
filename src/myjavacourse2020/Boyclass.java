package myjavacourse2020;

 class HumanClass {
	
	 public void eat (){
		
		System.out.println("Eating food...");
	}
}

public class Boyclass extends  HumanClass {
	
	@Override
	public void eat () {
		System.out.println("boy is eatimg food...");
	}
     public void show() {
    	eat();
     
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  
		Boyclass g = new Boyclass();
		 g.eat();
		 
	}

}
