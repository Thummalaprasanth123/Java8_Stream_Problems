package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class AllLongestWordsInAList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("apple", "banana", "orange", "pineapple", "blueberry");

		int i = words.stream().max(Comparator.comparingInt(String::length)).get().length();

		List<String> list = words.stream().filter(n -> n.length() == i).collect(Collectors.toList());

		System.out.println(list);

	}

}
