import java.util.Date;

public class Week1Main {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Week1Main();
		
	}
	
	public Week1Main() {
		
		// Creating a date object
		Date d1 = new Date(2019,02,04);
		
		// Creating a calendar object
		Calendar calendar = Calendar.getInstance();
		
		// Adding an event to the calendar
		calendar.addEvent(d1, "Amilcar's Class");
		
		// Retrieving the event on the date
		System.out.println(calendar.getEvent(d1));
		
		// Creating a date object
		Date d2 = new Date(2019,02,05);
				
		// Adding another event to the calendar
		calendar.addEvent(d2, "Greg's Class");

		System.out.println("Generic Calendar - Before Patricia's event");
		// Retrieving all events
		System.out.println(calendar.getEvents());

		User u1 = new User ("Anant");
		User u2 = new User ("Gama");
		User u3 = new User ("Patricia");

		Calendar u1Cal = u1.getCalendar();
		System.out.println("Anant Cal");
		System.out.println(u1Cal.getEvents());

		Calendar u2Cal = u2.getCalendar();
		System.out.println("Gama Cal");
		System.out.println(u2Cal.getEvents());

		Calendar u3Cal = u3.getCalendar();
		System.out.println("Patricia Cal");
		System.out.println(u3Cal.getEvents());

		//Creating a date object
		Date d3 = new Date(2019, 02, 10);

		// Adding another event to the calendar
		calendar.addEvent(d3, "Patricia's Event");

		System.out.println("Generic Calendar - After Patricia's event");

		System.out.println("Anant Cal");
		System.out.println(u1Cal.getEvents());

		System.out.println("Gama Cal");
		System.out.println(u2Cal.getEvents());

		System.out.println("Patricia Cal");
		System.out.println(u3Cal.getEvents());


	}

}
