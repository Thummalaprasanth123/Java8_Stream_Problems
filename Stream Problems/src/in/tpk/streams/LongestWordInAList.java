package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class LongestWordInAList {

	public static void main(String[] args) {
		List<String> words = Arrays.asList("cat", "elephant", "dog", "giraffe", "zebra");
		Optional<String> max = words.stream().max(Comparator.comparingInt(s -> s.length()));
		max.ifPresent(i -> System.out.println(i));
	}

}
