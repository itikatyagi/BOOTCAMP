package Introduction_To_Java;

public class excercise6 {

	public static void main(String[] args) {
		time t=new time();
		int sec=6548967;
		System.out.println("Total number of seconds:"+sec);
        t.secToStdTime(sec);
	}

}

class time
{
	void secToStdTime(int sec)
	{
		int comMin,comHr,remHr,comSec,remSec,comDay,remMin;
		comMin=sec/60;
		remSec=sec%60;
		sec/=60;
		
		comHr=sec/60;
		remMin=sec%60;
		sec/=60;
		
		comDay=sec/24;
		remHr=sec%24;
		
		System.out.println("converted standard time format :"+comDay+" days "+remHr+" hours "+remMin+" minutes "+remSec+" seconds ");
		
	}
	
}
