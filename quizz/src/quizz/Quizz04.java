package quizz;

@SuppressWarnings("squid:S106")
public class Quizz04 {
	
	private Quizz04() {}
	
	public static String sayNegative(int positive) {
		StringBuffer sb = new StringBuffer('-');
		sb.append(positive);
		return sb.toString();
	}
	
	public static void main(String[] args) {
		System.out.println(sayNegative(50));
	}
	
}
