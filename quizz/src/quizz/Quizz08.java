package quizz;

import java.io.File;

@SuppressWarnings("squid:S106")
public class Quizz08 {
	
	private Quizz08() {}

	public static void main(String[] args) {
		String str = "/ma|in.c";

		System.out.println(str.replaceAll(".", ""));
		System.out.println(str.replaceAll("|", "_"));
		System.out.println(str.replaceAll(File.separator, ""));
	}
}
