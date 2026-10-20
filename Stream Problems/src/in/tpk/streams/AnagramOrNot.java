package in.tpk.streams;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class AnagramOrNot {

	public static void main(String[] args) {
		String s1 = "Listen";
		String s2 = "Silen";
		s1 = Stream.of(s1.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		s2 = Stream.of(s2.split("")).map(String::toUpperCase).sorted().collect(Collectors.joining());
		if (s1.equals(s2)) {
			System.out.println("Two Strings are anagram");
		} else
			System.out.println("Two Strings are not anagram");
	}

}
