
public class User {

	private String name;
	private Calendar calendar;
	
	public User(String name) {
		
		this.name = name;
		calendar = Calendar.getInstance();
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Calendar getCalendar() {
		return calendar;
	}

	public void setCalendar(Calendar calendar) {
		this.calendar = calendar;
	}
	
	
	
	
	
}
