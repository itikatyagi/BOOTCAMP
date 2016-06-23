package Introduction_To_Java;
import java.util.*;
public class ex6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	  int arraySize,iter;
	  Scanner scanner=new Scanner(System.in);
	  System.out.println("enter the array size");
	  arraySize=scanner.nextInt();
      int []array=new int[arraySize];
      
      for(iter=0;iter<arraySize;iter++)
      {
    	  array[iter]=scanner.nextInt();
      }
      Arrays.sort(array);
      
      for(iter=0;iter<arraySize;)
      {
    	  if(iter+1<arraySize && array[iter]!=array[iter+1])
    	  {
    		  System.out.println("The non duplicated element is : "+array[iter]);
    		  break;
    	  }
    	  else
    		  iter+=2;
      }
	}

}
