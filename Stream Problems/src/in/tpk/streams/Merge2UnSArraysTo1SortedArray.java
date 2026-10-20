package in.tpk.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Merge2UnSArraysTo1SortedArray {
	
//	Distinct merge: First remove duplicates , hint:  .distinct().sorted().toArray() 
//	Reverse order: .boxed().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray() 
//	Find max after merge: .max().orElse(-1) 

	public static void main(String[] args) {
		int[] a = new int[] { 4, 2, 7, 1,9};
		int[] b = new int[] { 8, 3, 9, 5,1 };
	int[] c = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).sorted().mapToInt(i -> i).toArray();
		//int[] c = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).distinct().sorted().mapToInt(i -> i).toArray();
		//int[] c = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
		//int[] c = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).distinct().sorted(Comparator.reverseOrder()).mapToInt(i -> i).toArray();
		//Optional<Integer> max = Stream.concat(Arrays.stream(a).boxed(), Arrays.stream(b).boxed()).distinct().max(Comparator.naturalOrder());
		System.out.println(Arrays.toString(c));
		//max.ifPresent(i->System.out.println(i));
	}
}
