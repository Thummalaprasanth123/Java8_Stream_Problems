package in.tpk.streams;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class GetDuplicates {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
		HashSet<Integer> hs = new HashSet<>();
		List<Integer> collect = list.stream().filter(n -> !hs.add(n)).collect(Collectors.toList());
		System.out.println(collect);
	}

}
