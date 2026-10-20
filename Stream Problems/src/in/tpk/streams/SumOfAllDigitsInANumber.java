package in.tpk.streams;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfAllDigitsInANumber {

	public static void main(String[] args) {
		int i = 15623;
		Integer collect = Arrays.stream(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
		//below line also works
		// Integer sum = Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum();
		System.out.println(collect);
		// System.out.println(sum);
	}

}
