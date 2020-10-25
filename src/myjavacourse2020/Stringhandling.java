package myjavacourse2020;

public class Stringhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  String name = " this is Kalo";
  name.concat("Madebo");
  
  System.out.println(name);
   System.out.println( name.concat(" Madebo"));
  
  String str1 = new String("this is MESAY");
  System.out.println(str1);
   
  String sr2 = "i" + " loved" + " Jerry" + "ly";
  System.out.println(sr2);
  
  int len = name.length();
  System.out.println(len);
  
   int len1 = sr2.length();
   System.out.println(len1);
   
   int len2 = str1.length();
   System.out.println(len2);
   
   System.out.println(sr2.charAt(8));
   System.out.println(str1.charAt(8));
   
   String str3 = "SELAM";
   String str4 ="Selam";
   
   
   if(str3.equalsIgnoreCase(str4)){
   
	   System.out.println("the two strings are EQUAL");
	  }
   else
	  
	 
	{System.out.println("the two strings are not EQUAL");
	}
	}
	
	 
String str6 = "567867A5V6";
char ch;{
for(int i = 0;i<str6.length(); i++)
{
     ch = str6.charAt(i);
     System.out.println(ch);
     if(Character.isLetter(ch)){
        continue;
        }
      else{
        System.out.println("String contains NON Letter");
      }
}
}}


	
	
	
	
   

	


   

 
  
  
	

	

