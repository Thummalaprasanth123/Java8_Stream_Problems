package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class AnyEvenOrNot {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 6, 8, 10);

		boolean b = list.stream().anyMatch(i -> i % 2 == 0);
		System.out.println(b);

	}

}
