package in.tpk.stringproblems;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstnonRepeatingCharacterInAString {

	public static void main(String[] args) {
		String input = "aabbcdeffg";
		String nonRepeatingCharacter = Arrays.stream(input.split(""))
				.collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
				.entrySet()
				.stream()
				.filter(entry->entry.getValue()==1)
				.map(Map.Entry::getKey)
				.findFirst()
				.orElse(null);
		System.out.println(nonRepeatingCharacter);
		
	}

}
