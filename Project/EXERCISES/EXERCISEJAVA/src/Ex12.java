 abstract class Bank
 {
public void getdetails()
	{
		
	}
 }
class HDFC extends Bank{
 @Override
 public void getdetails() 
 {
	
	System.out.println("ROI  of HDFC IS 10%");
	

 }

 }

class ICICI extends Bank{
	 public void getdetails() 
	 {
	System.out.println("ROI OF ICICI IS 12%");
}
}
class SOI extends Bank{

	public void getdetails() 
	 {
		
		System.out.println("ROI OF SOI IS 10%");
		
	 }

}
 public class Ex12 {
	 
	
public static void main(String args[])
{
	
HDFC hdfc =new HDFC();
hdfc.getdetails();
ICICI icici =new ICICI();
icici.getdetails();
SOI soi =new SOI();
soi.getdetails();

	}
}

