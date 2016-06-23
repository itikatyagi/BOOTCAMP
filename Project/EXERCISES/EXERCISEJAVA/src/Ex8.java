
public class Ex8 {
  
  
    public static void main(String args[]) {
      
        
        String word = "HelloWorld";
        String reverse = new StringBuffer(word).reverse().toString();
        System.out.printf(" original String : %s , reversed String: %s  %n", word, reverse);
      
        
        StringBuffer buff = new StringBuffer(reverse);
        System.out.println("buffer = " + buff);
      
        
        buff.delete(4, 9);
        System.out.println("After deletion = " + buff);
    }
   
    
}


