package in.tpk.stringproblems;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MostRepeatedNumberInAGivenList {

	public static void main(String[] args) {
		List<Integer> numbs = Arrays.asList(10, 20, 5, 8, 30, 25, 30, 20, 20);

		Integer mostRepeated = numbs.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
				.entrySet()
				.stream()
				.max(Map.Entry.comparingByValue())
				.map(Map.Entry::getKey)
				.orElse(null);
		System.out.println(mostRepeated);

	}

}
