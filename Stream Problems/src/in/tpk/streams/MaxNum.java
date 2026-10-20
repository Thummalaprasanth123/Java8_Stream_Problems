package in.tpk.streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class MaxNum {

	public static void main(String[] args) {
		//List<Integer> numbers = Arrays.asList(1, 2, 4, 41, 4);
		Stream<Integer> of = Stream.of(1, 2, 41, 4);
		Integer maxnum = of.max(Comparator.naturalOrder()).orElse(0);
		System.out.println(maxnum);
	}

}
