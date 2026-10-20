package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ThirdHighestElement {

	public static void main(String[] args) {
		List<Integer> loi = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		Optional<Integer> first = loi.stream().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		first.ifPresent(i -> System.out.println(i));
	}

}
