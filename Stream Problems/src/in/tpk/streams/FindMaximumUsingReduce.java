package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class FindMaximumUsingReduce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(7, 2, 10, 4);
		Integer reduce = numbers.stream().reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
		System.out.println(reduce);

	}

}
