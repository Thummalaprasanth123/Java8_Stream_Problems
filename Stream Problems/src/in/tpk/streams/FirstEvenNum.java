package in.tpk.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FirstEvenNum {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(11, 5, 6, 7, 8, 4, 16, 14);
		Optional<Integer> first = list.stream().filter(n -> n % 2 == 0).findFirst();
		first.ifPresent(i -> System.out.println(i));
		System.out.println(first.isPresent());

	}

}
