package Introduction_To_Java;
class initializers
{ 
	static String firstName;
	static String lastName;
	static int age;
	
	static
	{
		firstName="Nitin";
		lastName="Khulbe";
		age=22;
		System.out.println("*****STATIC BLOCK*****");
		System.out.println("first name : "+firstName);
		System.out.println("last name : "+lastName);
		System.out.println("age is : "+age );
	}
	
	static void display()
	{
		firstName="Nitin";
		lastName="Khulbe";
		age=22;
		System.out.println("####STATIC METHOD####");
		System.out.println("first name : "+firstName);
		System.out.println("last name : "+lastName);
		System.out.println("age is : "+age);	
		
	}
}
public class ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        initializers.display();
        System.out.println("@@@@STATIC VARIABLES@@@@");
        System.out.println("first name : "+initializers.firstName);
        System.out.println("last name : "+initializers.lastName);
        System.out.println("age : "+initializers.age);
	}

}
