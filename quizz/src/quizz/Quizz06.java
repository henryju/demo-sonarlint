package quizz;

@SuppressWarnings("squid:S106")
public class Quizz06 {

	private Quizz06() {
	}

	public static Number choose(Integer i, Float f, boolean takeFirst) {
		return takeFirst ? i : f;
	}

	public static boolean isEqualToZero(double a) {
		return a == 0;
	}

	public static void main(String[] args) {
		System.out.println(choose(123456789, 1.0f, true));
		System.out.println(isEqualToZero(1.0 - 0.9f - 0.1f));
	}

}
