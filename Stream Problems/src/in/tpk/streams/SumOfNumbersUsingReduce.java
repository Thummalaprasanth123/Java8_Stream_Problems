package in.tpk.streams;

import java.util.Arrays;
import java.util.List;

public class SumOfNumbersUsingReduce {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 10, 15, 20);
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);
		System.out.println(sum);
	}

}


//1st time --->  reduce(0, (0,5)->0+5); // 5

//2nd time --->  reduce(5, (5,10)->5+10); // 15

//3rd time --->  reduce(15, (15,15)->15+15); // 30

//4th time --->  reduce(30, (30,20)->30+20); // 50