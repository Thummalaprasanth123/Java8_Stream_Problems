package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestString {

	public static void main(String[] args) {
		List<String> strs = Arrays.asList("apple", "banana", "orangehhh", "grape", "kiwi");
		//String longstr = strs.stream().max((o1, o2) -> o1.length() - o2.length()).orElse(" ");
		String longstr = strs.stream().max(Comparator.comparing(String::length)).orElse(" ");
		System.out.println(longstr);
	}

}
