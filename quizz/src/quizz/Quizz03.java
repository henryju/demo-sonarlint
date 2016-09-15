package quizz;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

@SuppressWarnings("squid:S106")
public class Quizz03 {
	
	private Quizz03() {	}
	
	public static class IntIterator implements Iterator<Integer> {
		int current = 0;
		@Override public Integer next() { return current++; }
		
		@Override public boolean hasNext() {
			return next() <= Integer.MAX_VALUE;
		}
	}
	
	public static void main(String[] args) {
		stream(new IntIterator())
			.limit(10)
			.forEach(System.out::println);
	}

	private static Stream<Integer> stream(IntIterator it) {
		return StreamSupport
			.stream(
		          Spliterators.spliteratorUnknownSize(it, Spliterator.ORDERED),
		          false);
	}

}
