package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class StrStartsWithA {

	public static void main(String[] args) {
		List<String> nameList = Arrays.asList("Banana", "Apple", "Cat", "Andrew");
		boolean b = nameList.stream().anyMatch(i -> i.startsWith("A"));
		System.out.println(b);

	}

}
