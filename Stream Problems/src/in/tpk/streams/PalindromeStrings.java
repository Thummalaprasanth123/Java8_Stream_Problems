package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class PalindromeStrings {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Telugu", "Tamil", "MalayalaM");
		List<String> list2 = list.stream().filter(s -> {
			return s.toLowerCase().contentEquals(new StringBuffer(s.toLowerCase()).reverse());
		}).toList();
		System.out.println(list2);
	}

}
