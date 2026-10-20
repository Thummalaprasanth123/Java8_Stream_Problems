package in.tpk.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseEachWordOfAString {

	public static void main(String[] args) {
		String str = "Java Concept Of The Day";
		String collect = Arrays.stream(str.split(" ")).map(s -> new StringBuffer(s).reverse())
				.collect(Collectors.joining(" "));
		System.out.println(collect);

	}

}
