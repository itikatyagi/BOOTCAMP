package Introduction_To_Java;
import java.util.*;
public class ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner input=new Scanner(System.in);
        System.out.println("enter a string");
        String inputStr=input.nextLine();
        //converted string to character array because string are immutable 
        char array[]=inputStr.toCharArray();
        
        //sorted the character array
        Arrays.sort(array);
        
        int iter1,iter2=0,count;
        
        for(iter1=0;iter1<array.length;iter1+=count)
        {
        	iter2=iter1+1;
        	count=1;
        	while(iter2<array.length && array[iter1]==array[iter2])
        	{
        		iter2++;
        		count++;
        	}
        	
        	if(count>=2)
        	{
        		System.out.println("occurences : "+array[iter1]+" ="+count);
        	}
        }
	}

}
