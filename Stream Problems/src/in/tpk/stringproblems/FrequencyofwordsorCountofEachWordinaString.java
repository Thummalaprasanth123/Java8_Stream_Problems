package in.tpk.stringproblems;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequencyofwordsorCountofEachWordinaString {

	public static void main(String[] args) {
		
		String sent = "Java is fun and java is powerful"; 
		Map<String,Long> map = Arrays.stream(sent.toLowerCase().split("\\s"))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(map);
		

	}

}
