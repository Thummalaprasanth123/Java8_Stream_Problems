package in.tpk.streamsscenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamBeginnerQuestions {

	public static void main(String[] args) {
		// 1. Filtering Even Numbers
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		List<Integer> evenNumbers = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(evenNumbers);
		
		// 2. Convert List of Strings to UpperCase
		
		List<String> words = Arrays.asList("apple", "banana", "cherry");
		
		List<String> strUpperCase = words.stream().map(w->w.toUpperCase()).toList();
		System.out.println(strUpperCase);
		
		// 3. Find the First Element that Starts with 'S'
		
		List<String> names = Arrays.asList("John", "Smith", "Sara", "Michael");
		
		List<String> strwiths = names.stream().filter(n->n.toLowerCase().startsWith("s")).toList();
		Optional<String> first = names.stream().filter(n->n.startsWith("S")).findFirst();
		System.out.println(strwiths);
		first.ifPresent(System.out::println);
		System.out.println(first.get());
		
		// 4. Sum of All Elements
		
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Integer sum = nums.stream().reduce(0,(a,b)->(a+b));
		System.out.println(sum);
		Optional<Integer> optionalsum = nums.stream().reduce((a,b)->(a+b));
		System.out.println(optionalsum.get());
		
		// 5. Count Words with Length > 3
		
		List<String> wordList = Arrays.asList("a", "the", "cat", "elephant", "dog");
		long count = wordList.stream().filter(w->w.length()>3).count();
		System.out.println(count);
		
		// 6. Sorting Numbers in Descending Order
		
		List<Integer> DescOrder = nums.stream().sorted(Comparator.reverseOrder()).toList();
		System.out.println(DescOrder);
		
		// 7. Remove Duplicates from a List
		   //Using Distinct
		List<Integer> dupNums = Arrays.asList(1, 2, 3, 2, 4, 3, 5, 1);
		List<Integer> uniqueelements = dupNums.stream().distinct().toList();
		System.out.println(uniqueelements);
		
		   //Using HashSet without using Distinct
		HashSet<Integer> hs=new HashSet<>();
		List<Integer> list = dupNums.stream().filter(hs::add).toList();
		System.out.println(list);
		
		// 8. Convert List of Strings to a Single Comma-Separated String
		
		List<String> ws = Arrays.asList("apple", "banana", "cherry");
		String joinedstr = ws.stream().collect(Collectors.joining(","));
		System.out.println(joinedstr);
		
		// 9. Find the Maximum Value
		List<Integer> numbs = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		Optional<Integer> max = numbs.stream().max(Comparator.naturalOrder());
		System.out.println(max.get());
		
		// 10. Check if Any String Starts with 'A'
		
		List<String> nameList = Arrays.asList("Bob", "Alice", "Charlie", "Andrew");
		boolean anyMatch = nameList.stream().anyMatch(i->i.startsWith("A"));
		System.out.println(anyMatch);
	}

}
