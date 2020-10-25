package myjavacourse2020;

public class Narrowingdatatype {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 double a = 123456.3456;
 float b = (float)a;
 long c = (long)b;
 int d = (int)c;
 short e =(short)d;
 byte f = (byte)e;
 
 System.out.println("double:" + a);
 System.out.println("float:" + b);
 System.out.println("long:" + c);
 System.out.println("int:" + d);
 System.out.println("short:" +e);
 System.out.println("byte:" + f);
 
 
 
 
	}

}
