package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class listOfSentencesIntoUniqueWords {

	public static void main(String[] args) {
		List<String> sen = List.of("java is cool", "cool code in java");
		Set<String> set = sen.stream().flatMap(s -> Arrays.stream(s.split(" ")))
				.sorted().collect(Collectors.toSet());
		System.out.println(set);
	}

}
