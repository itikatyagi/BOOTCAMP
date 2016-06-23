

public class Demo {
   
   public Demo(){
         System.out.println("Default constructor");
   }
   public Demo(String str){
         this();
    	 System.out.println("Parametrized constructor with single param");
   }
   public Demo(int num1, int num2){
         
    	 this("Hello"); 
    	 System.out.println("Parametrized constructor with double args");
   }
  
   public static void main(String args[]){
        
        Demo obj = new Demo(5,5);
   }
}