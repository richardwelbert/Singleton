import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Calendar {

	private static Calendar instance = new Calendar();

	// HashMap to save one event per date
	private Map <Date, String> calendar;
	
	// Constructor
	private Calendar () {
		
		calendar = new HashMap<Date, String>();
		
		
	}
	
	// Add event on a particular date
	public void addEvent(Date date, String event) {
		
		calendar.put(date, event);
		
	}
	
	// Check event on a particular date
	public String getEvent(Date date) {
		
		return calendar.get(date);
	
	}
	
	public String getEvents() {
		String events = "";
		
		for (Entry entry : calendar.entrySet()) {
		    events += entry.getKey() + " - " + entry.getValue() + "\n";
		}
		
		return events;
	}

	public static Calendar getInstance() {
		return instance;
	}
}
