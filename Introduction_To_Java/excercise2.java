/**
 * 
 */
package Introduction_To_Java;
import java.util.*;

/**
 * @author Nitin Khulbe
 * date:22/06/16
 * program:sorting a string without using string methods
 */
@SuppressWarnings("unused")
public class excercise2 {

	stringSorting inpStr=new stringSorting();
	public static void main(String[] args) {
		
		int iter;
		stringSorting input=new stringSorting();
		
		System.out.print("Initial unsorted data:");
		String inputStr="computer";
		
		System.out.println(inputStr+"\t");
		
		System.out.print("sorted data:");
        input.selectionSort(inputStr);
	}

}

class stringSorting
{
	void selectionSort(String input)
	{
		int i,j;
		
		char ch;
		
		char array[]=input.toCharArray();
		
		for(i=0;i<array.length;i++)
		{
		  for(j=i+1;j<array.length;j++)
		  {
			  if(array[i]>array[j])
			  {
				  ch=array[i];
				  array[i]=array[j];
				  array[j]=ch;
			  }
		  }
		}
		
			System.out.print(input+"\t");
	}
	
}