 public class Ex11{  
 
void sum(int a,int b){System.out.println(a+b);}  
  void sum(double a,double b){System.out.println(a+b);}  
void mul(float a) { 
	  System.out.println(a*a);
	  } 
 void mul(int a) { 
	  System.out.println(a*a);
	 } 
String concate (int x, int y)
 {
    
	
	System.out.println( x + " + " + y + " = " +x+y);
	return null;
 }
String concate (int x, int y ,int z)
{
   
	
	System.out.println( x + " + " + y + "+" + z+" = " +x+y+z);
	return null;
}
  public static void main(String args[]){  
  Ex11 obj=new Ex11();  
  obj.sum(10.5,10.5);  
  obj.sum(20,20); 
 obj.mul(3.7f);
 obj.mul(2);
 obj.concate(1,2);
 obj.concate(1,2,3);
}
 }