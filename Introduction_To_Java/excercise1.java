/*Author:Nitin Khulbe
Date Created:22-06-2016
LIBRARY MANAGEMENT SYSTEM*/

package Introduction_To_Java;
import java.util.*;

//declaring the abstract class library
abstract class library
{
	String bookName;
	String authorName;
	String status;
	int numOfCopies;
	int ISBNcode;
	
	public void setBook( String bkName,String athName,String bkStatus,int copies,int ISBN)
	{
		bookName=bkName;
		authorName=athName;
		status=bkStatus;
		numOfCopies=copies;
		ISBNcode=ISBN;
	}
	
	public String getBook()
	{
		String result="Book Name : "+ this.bookName+"\n"+ "Author name : "+this.authorName+"\n"+"Book status: "+this.status+"\n" + "Book copies : "+this.numOfCopies+"\n"+"Book ISBN : "+this.ISBNcode+"\n";
		return result;
	}
}

interface myInterface
{
	public void addBook(String bookName,String authorName,String status,int Copies,int ISBN);
}

class book extends library implements myInterface
{
	void updateStatus( String status,int copies)
	{
		this.status=status;
		numOfCopies=copies;
	}
	public void addBook(String bookName,String authorName,String status,int Copies,int ISBN)
	{
	 this.bookName=bookName;
	 this.authorName=authorName;
	 this.status=status;
	 this.numOfCopies=Copies;
	 this.ISBNcode=ISBN;	 
	}
}


public class excercise1 {

	public static void main(String[] args) {
		
		book b=new book();
		
		System.out.println("Setting a book using setter");
		b.setBook("Let Us C","yashwant Kanitkar","unissued", 5,1123568989 );
		
		System.out.println("Retrieving book information");
		System.out.println(b.getBook());
		
		System.out.println("Updating book status");
        b.updateStatus("issued", 10);
        System.out.println(b.getBook());
        
        System.out.println("Adding a new book");
        book b1=new book();
        b1.addBook("Introduction to algorithms", "Thomas.H.Cormen", "unissued", 2,656565656 );
        System.out.println(b1.getBook());
        
	}

}

