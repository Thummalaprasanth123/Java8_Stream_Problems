package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Top3ElementsfromList {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
		List<Integer> list2 = list.stream().sorted(Comparator.reverseOrder()).limit(3).toList();
		System.out.println(list2);
	}

}
