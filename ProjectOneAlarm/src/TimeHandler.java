import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;


public class TimeHandler {
			
	Timer timer= new Timer();
	DateFormat dateFormat = new SimpleDateFormat("hh:mm:ss");		
	Date date =  new Date();
	TimeKeeper timekeeper = new TimeKeeper();
	
	
	
	
	String showTime(){
		
	
	return date.toString();
	
	
	
	
	}



}