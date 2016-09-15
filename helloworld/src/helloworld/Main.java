package helloworld;

@SuppressWarnings("squid:S106")
public class Main {

	private static final int MAJORITE = 18;

	private Main() {
	}

	public static void conduite(int age, int nbPassagers, String pays) {
		if (age >= MAJORITE && nbPassagers <= 5 && "FR".equals(pays)) {
			if (age >= 16 && age < MAJORITE) {
				System.out.println("Conduite accompagnée");
			} else {
				System.out.println("Conduite");
			}
		} else {
			System.out.println("Autre");
		}
	}
	
	public static void main(String[] args) {
		conduite(18, 4, "EN");
		conduite(18, 4, "FR");
		conduite(16, 4, "FR");
	}
	
	private String foo(String bar) {
		return "Foo";
	}

}
