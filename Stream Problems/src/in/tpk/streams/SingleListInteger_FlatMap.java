package in.tpk.streams;

import java.util.List;
import java.util.stream.Collectors;

public class SingleListInteger_FlatMap {

	public static void main(String[] args) {
		List<List<Integer>> of = List.of(List.of(1, 2), List.of(3, 4));
		List<Integer> list = of.stream().flatMap(s -> s.stream()).collect(Collectors.toList());
		System.out.println(list);

		// .flatMap(s->stream(s)).sorted().collect(Collectors.toList());
	}

}
