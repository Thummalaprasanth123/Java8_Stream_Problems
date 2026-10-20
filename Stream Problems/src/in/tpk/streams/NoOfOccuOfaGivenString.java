package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class NoOfOccuOfaGivenString {

	public static void main(String[] args) {
		String str = "java";
		List<String> strings = Arrays.asList("java scala ruby", "java react spring java");
		long count = strings.stream().flatMap(s -> Arrays.stream(s.split(" "))).peek(System.out::println)
				.filter(w -> w.equals(str)).count();
		System.out.println(count);
	}

}
