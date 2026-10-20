package in.tpk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetDistinctCharactersFromAListOfWords {

	public static void main(String[] args) {
		List<String> words = List.of("java", "scala");

		List<String> list = words.stream().flatMap(s -> Arrays.stream(s.split(""))).distinct()
				.collect(Collectors.toList());
		System.out.println(list);

	}

}
