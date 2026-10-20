package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class NumStartsWith1 {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 12, 20, null, 19, 30);
		List<Integer> list2 = list.stream().filter(i -> String.valueOf(i).startsWith("1")).toList();
		System.out.println(list2);

	}

}
