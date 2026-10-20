package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class AllEvenNums {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(2,5,6,7,8,4,16,14);
		List<Integer> list2 = list.stream().filter(n->n%2==0).toList();
		System.out.println(list2);

	}

}
