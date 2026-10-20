package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class StringProgramsUsingReduce {

	public static void main(String[] args) {

		List<String> words = Arrays.asList("cat", "elephant", "dog", "tiger");
		// 1. Find the longest word
		String longest = words.stream().reduce((a, b) -> a.length() > b.length() ? a : b).orElse("");

		System.out.println(longest);

		// 2. Find the shortest word

		String shortest = words.stream().reduce((a, b) -> a.length() < b.length() ? a : b).orElse("");

		System.out.println(shortest);

		// 3. Combine all words into one string

		String combined = words.stream().reduce("", (a, b) -> a + b);

		System.out.println(combined);

		// 4. Find the total length of all words

		int totalLength = words.stream().map(String::length).reduce(0, (a, b) -> a + b);

		System.out.println(totalLength);
	}

}
