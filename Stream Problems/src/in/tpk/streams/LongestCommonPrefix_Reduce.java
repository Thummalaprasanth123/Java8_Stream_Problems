package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class LongestCommonPrefix_Reduce {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("flower", "flow", "flight");
		String longestCommonPrefix = list.stream().reduce((s1, s2) -> {
			int length = Math.min(s1.length(), s2.length());
			int i = 0;
			while (i < length && s1.charAt(i) == s2.charAt(i)) {
				i++;
			}
			return s1.substring(0, i);

		}).orElse("");
		System.out.println("Longest commmon prefix : " + longestCommonPrefix);
	}

}
