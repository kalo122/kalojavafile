package myjavacourse2020;

abstract class Figure{
	abstract void calcArea(double length);
}



class ChildFigure extends Figure{

	@Override
	void calcArea(double length) {
		// TODO Auto-generated method stub
	double result = length*length;
	System.out.println("area of rectangle:" + result);
	}
	
}

public class figureImpClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChildFigure f = new ChildFigure();
		f.calcArea(12);
	}

}
