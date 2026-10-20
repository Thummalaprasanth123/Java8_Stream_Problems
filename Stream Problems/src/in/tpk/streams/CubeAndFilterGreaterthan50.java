package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class CubeAndFilterGreaterthan50 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2, 4, 1, 3, 7, 8, 9);

		List<Integer> list2 = list.stream().map(n -> n * n * n).filter(n -> n > 50).toList();

		System.out.println(list2);
	}

}
