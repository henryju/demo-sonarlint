package quizz;

@SuppressWarnings("squid:S106")
public class Quizz01 {

	private Quizz01() {
	}

	public enum Color {
		BLUE, RED, GREEN
	}

	public static void sayColor(Color color) {
		switch (color) {
		case BLUE:
			System.out.println("Blue");
			break;
		case RED:
			System.out.println("Red");
		case GREEN:
			System.out.println("Blue");
			break;
		}
	}

	public static void main(String[] args) {
		sayColor(Color.BLUE);
		sayColor(Color.RED);
		sayColor(Color.GREEN);
	}

}
