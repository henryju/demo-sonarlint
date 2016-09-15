package quizz;

@SuppressWarnings("squid:S106")
public class Quizz05 {
	
	private Quizz05() {}
	
	public enum Day {MONDAY, TUESDAY, WEDNESDAY, 
		THURSDAY, FRIDAY, SATURDAY, SUNDAY}
	
	public static String sayToWork(Day day) {
		switch (day) {
			case MONDAY:
				 TUESDAY:
			     WEDNESDAY:
			     THURSDAY:
			     FRIDAY:
			    	 return "Work";
			case SATURDAY:
				 SUNDAY:
					 return "Sleep";
			default:
				 return "Just another day";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(sayToWork(Day.TUESDAY));
	}
	
	

}
