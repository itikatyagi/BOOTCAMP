package Introduction_To_Java;

public class excercise8 {

	public static void main(String[] args) {
		
     convertForToWhile obj=new convertForToWhile();
     System.out.println("output of the while loop converted from for loop:");
     
     obj.conversionMethod();
     
     System.out.println("output of original for loop:");
     
     onlyFor obj1=new onlyFor();
     obj1.myfunction();
	}

	
}

class convertForToWhile
{
	void conversionMethod()
	{
		int s=0,t=1,i=0;
		while(i<10)
		{
			s=s+i;
			int j=i;
			
			while(j>0)
			{
				t=t*(j-i);
				j--;
			}
			s*=t;
			System.out.println("T is " + t);
			i++;
		}
		System.out.println("S is " + s);
	}
}

class onlyFor
{
	void myfunction()
	{
		
	int s = 0; 
	int t = 1;
	for (int i = 0; i < 10; i++) 
	{ 
	s = s + i; 
	for (int j = i; j > 0;j--) 
	{ 
	t = t * (j - i); 
	} 
	s = s * t; 
	System.out.println("T is " + t); 
	} 
	System.out.println("S is " + s);
	}
}
