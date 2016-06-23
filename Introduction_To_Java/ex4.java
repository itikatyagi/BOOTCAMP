package Introduction_To_Java;
import java.util.*;
public class ex4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String inputStr;
        
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the string");
        inputStr=scan.nextLine();
        char input[]=inputStr.toCharArray();
        int iter;
        int lowerStr=0,upperStr=0,specialStr=0,digitStr=0;
        int length=inputStr.length();
        for(iter=0;iter<length;iter++)
        {
        	if(Character.isAlphabetic(input[iter]))
        	{
        		if(Character.isUpperCase(input[iter]))
        			upperStr++;
        		else
        			lowerStr++;
        	}
        		
        	else if(Character.isDigit(input[iter]))
        		digitStr++;
        	else
        		specialStr++;
        }
        lowerStr=(lowerStr*100)/length;
        upperStr=(upperStr*100)/length;
        specialStr=(specialStr*100)/length;;
        digitStr=(digitStr*100)/length;
        System.out.println("The percentage of lower case letters is : "+lowerStr);
        System.out.println("The percentage of upper case letters is : "+upperStr);
        System.out.println("The percentage of special case letters is : "+specialStr);        
        System.out.println("The percentage of digit case letters is : "+digitStr);
	}

}
