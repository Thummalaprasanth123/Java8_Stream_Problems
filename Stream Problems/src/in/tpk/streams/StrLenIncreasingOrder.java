package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StrLenIncreasingOrder {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("JAVA", "Spring", "AI", "Spring Boot");
		List<String> list2 = list.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
		System.out.println(list2);

	}

}
