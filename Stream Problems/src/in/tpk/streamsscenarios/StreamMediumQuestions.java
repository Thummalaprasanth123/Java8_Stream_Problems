package in.tpk.streamsscenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamMediumQuestions {

	public static void main(String[] args) {

		// 1. Find the Second-Highest Number

		List<Integer> numbers = Arrays.asList(10, 20, 5, 8, 30, 25, 29,30);

		Optional<Integer> secondHighest = numbers.stream()
				.sorted(Comparator.reverseOrder())
				.distinct()
				.skip(1)
				.findFirst();
		System.out.println(secondHighest.get());
		
		// 2. Count Occurrences of Each Word
		
		List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana", "apple");
		
		Map<String,Long> wordCount = words.stream().collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		System.out.println(wordCount);
		
		// 3. Remove Null and Empty Values
		
		List<String> values = Arrays.asList("Hello", "", null, "World", "Java", "");
		
		List<String> valueswithoutNullOrEmpty = values.stream().filter(i->i!=null).filter(i->i.length()>0).toList();
		
		/*
		 * List<String> filteredValues = values.stream() .filter(Objects::nonNull) //
		 * Filters out null values .filter(s -> !s.isEmpty()) // Filters out empty
		 * strings .collect(Collectors.toList()); // Collects the remaining values into
		 * a list
		 */		
		System.out.println(valueswithoutNullOrEmpty);
		
		// 4. Find the Longest Word
		
		String longestword = words.stream().max(Comparator.comparingInt(String::length)).orElse(null);
		System.out.println(longestword);
		
		// 5. Convert List of Objects to a Map
		   // Steps: Convert List<Employee> to Map<Id, Name>
		        List<Employee> list = Arrays.asList(new Employee(1,"John"),new Employee(2,"Jane"));
		        Map<Integer, String> collect = list.stream().collect(Collectors.toMap(Employee::getId,Employee::getName));
		        
		        System.out.println(collect);
		        
		//6. Flatten a List of Lists into a Single List

		       List<List<Integer>> nestedList = Arrays.asList(Arrays.asList(1,2,3),Arrays.asList(4,5,6));
		       List<Integer> flattenList1 = nestedList.stream().flatMap(List::stream).toList();
		       List<Integer> flattenList2 = nestedList.stream().flatMap(s->s.stream()).toList();
		       System.out.println(flattenList1);
		       System.out.println(flattenList2);
		       
		// 7. Find First Non-Repeating Character in a String
		       
		       String input = "aabbcdeffg";
		       String nonRepeatChar = Arrays.stream(input.split(""))
		    		   .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		    		   .entrySet()
		    		   .stream()
		    		   .filter(entry->entry.getValue()==1)
		    		   .map(Map.Entry::getKey)
		    		   .findFirst()
		    		   .orElse(null);
		       System.out.println(nonRepeatChar);
		       
		       
		       Character firstNonRepeatChar = input.chars()   //IntStream
		       .mapToObj(c->(char)c)   //Character Stream
		       .collect(Collectors.groupingBy(Function.identity(), // Groups by character
                       LinkedHashMap::new, 
                       Collectors.counting())) // Counts occurrences
.entrySet().stream()
.filter(entry -> entry.getValue() == 1) // Filters characters occurring only once
.map(Map.Entry::getKey) // Extracts the character
.findFirst() // Finds the first match
.orElse(null); // Returns null if no match found
		       
		       System.out.println(firstNonRepeatChar);
		       
		       
		    // 8. Group Numbers into Even and Odd
		       
		       List<Integer> EvenAOddNums = Arrays.asList(10, 20, 5, 8, 30, 25, 29,30);
		       Map<Boolean,List<Integer>> EvenAOddNumsPatitioning = EvenAOddNums.stream().collect(Collectors.partitioningBy(n->n%2==0));
		       System.out.println(EvenAOddNumsPatitioning);
		       
		    // 9. Sort Strings by Length
		        // Steps: Sort words based on length
		       
		       List<String> collect2 = words.stream().sorted(Comparator.comparingInt(String::length)).collect(Collectors.toList());
		       System.out.println(collect2);
		       
		    // 10. Find the Most Repeated Number
                // Steps: Count occurrences -> Get the most repeated number
		       
		       List<Integer> nums = Arrays.asList(10, 20, 5, 8, 30,5, 25, 29,30,20,19,19,5,5);
		       
		       Integer MostRepeatedNum = nums.stream()
		    		   .collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		       .entrySet()
		       .stream()
		       .max(Map.Entry.comparingByValue())
		       .map(Map.Entry::getKey)
		       .orElse(null);
		       
		       System.out.println(MostRepeatedNum);
		       
		       
		       
		       
	}

}

   
		
		class Employee{
			private int id;
			private String name;
			
			public Employee(int id, String name) {
				this.id=id;
				this.name=name;
			}
			public int getId() {
				return id;
			}
			public String getName() {
				return name;
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

