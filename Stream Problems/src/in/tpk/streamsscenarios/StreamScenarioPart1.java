package in.tpk.streamsscenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamScenarioPart1 {

	public static void main(String[] args) {

		List<Integer> num = List.of(1, 2, 7, 3, 4, 5, 2, 3,6, 7, 8, 8);
		
		//Remove duplicates
		
		List<Integer> nonDuplicateElements = num.stream().distinct().collect(Collectors.toList());
		System.out.println(nonDuplicateElements);
		
		//Find second highest salary
		
		List<Integer> salaries = List.of(3000,9000, 5000, 7000, 9000, 5000);
		
		Integer secondHighestSalary = salaries.stream().sorted(Comparator.reverseOrder()).distinct().skip(1).findFirst().orElse(null);
		System.out.println(secondHighestSalary);
		
		// allMatch, noneMatch and anyMatch examples
		
		num = List.of(2, 4, 6, 7, 10,3,12,1,7); //List contain one odd number
		
		//List contains only even numbers
		
		List<Integer> onlyEven = num.stream().filter(n->n%2==0).toList();
		System.out.println(onlyEven);
		
		//using allMatch
		
		boolean b = num.stream().allMatch(n->n%2==0);
		System.out.println(b);
		
		//List does not contain any odd numbers
		
		boolean noneMatch = num.stream().noneMatch(n->n%2!=0);
		System.out.println(noneMatch);
		
		//List contains at least one even number
		
		boolean anyMatch = num.stream().anyMatch(n->n%2==0);
		System.out.println(anyMatch);
		
		
	}

}
