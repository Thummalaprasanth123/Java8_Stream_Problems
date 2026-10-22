package in.tpk.streamsscenarios;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Student {
	String firstName, lastName, city, department;
	double grade;
	int age;

	public Student(String firstName, String lastName, String city, double grade, int age, String department) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.city = city;
		this.grade = grade;
		this.age = age;
		this.department = department;
	}

	@Override
	public String toString() {

		return firstName + " " + lastName + " (" + city + ", " + grade + ", " + age + ", " + department + ")";
	}

}

public class StreamsOnStudentData {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(new Student("Rahul", "Sharma", "Hyderabad", 8.38, 19, "Civil"),
				new Student("Amit", "Verma", "Delhi", 8.4, 21, "IT"),
				new Student("Suresh", "Reddy", "Hyderabad", 7.5, 20, "Civil"),
				new Student("Kiran", "Patel", "Mumbai", 9.1, 20, "IT"),
				new Student("Arjun", "Naidu", "Bengaluru", 7.83, 20, "Civil"));

		// 1. Find students from Hyderabad with a grade greater than 8.0

		List<Student> list = students.stream().filter(i -> i.city.equals("Hyderabad") && i.grade > 8.0).toList();
		System.out.println(list);

		// 2. Find the student with the highest grade

		Optional<Student> max = students.stream().max(Comparator.comparingDouble(s -> s.grade));
		// Student student =
		// students.stream().max(Comparator.comparingDouble(s->s.grade)).orElse(null);

		System.out.println(max.orElse(null));

		// 3. Count the number of students in each department

		Map<String, Long> map = students.stream()
				.collect(Collectors.groupingBy((s -> s.department), Collectors.counting()));
		System.out.println(map);

		// 4. Find the average grade per department

		Map<String, Double> collect = students.stream()
				.collect(Collectors.groupingBy((s -> s.department), Collectors.averagingDouble(d -> d.grade)));
		System.out.println(collect);

		// 5. List students sorted by age and then by grade

		List<Student> list2 = students.stream()
				.sorted(Comparator.comparingInt((Student s) -> s.age).thenComparingDouble(s -> s.grade)).toList();
		System.out.println(list2);

		// 6. Create a comma-separated list of student names

		String names = students.stream().map(s -> s.firstName + " " + s.lastName).collect(Collectors.joining(", "));
		System.out.println("6. Comma-separated student names: " + names);

		// 7. Check if all students are above 18

		boolean b = students.stream().allMatch(i -> i.age > 18);
		System.out.println(b);

		// 8. Find the department with the most students

		String orElse = students.stream().collect(Collectors.groupingBy(s -> s.department, Collectors.counting()))
				.entrySet().stream().max(Map.Entry.comparingByValue()).map(Map.Entry::getKey).orElse("None");
		System.out.println(orElse);

		// 9. Divide students into those who have grades above 8.0 and below
		Map<Boolean, List<Student>> gradePartition = students.stream()
				.collect(Collectors.partitioningBy(s -> s.grade > 8.0));
		System.out.println("9. Students partitioned by grade: " + gradePartition);

		// 10. Find the student with the longest full name
		Optional<Student> longestNameStudent = students.stream()
				.max(Comparator.comparingInt(s -> (s.firstName + s.lastName).length()));
		System.out.println("10. Student with the longest full name: " + longestNameStudent.orElse(null));

	}

}
