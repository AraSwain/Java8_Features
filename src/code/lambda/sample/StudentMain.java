package code.lambda.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StudentMain {
	public static void main(String[] args) {
		List<Student> list = new ArrayList<>();
		
		list.add(new Student(1, "Ram", 25));
		list.add(new Student(3, "Shyam", 22));
		list.add(new Student(2, "Hari", 29));
		
		//for(Student s:list) 
		//	System.out.println(s);
		list.forEach(s -> System.out.println(s));
		
		
		/*Collections.sort(list, new Comparator<Student>() {

			public int compare(Student s1, Student s2) {
				return s1.roll - s2.roll;
			}
		});*/
		
		Collections.sort(list, (Student s1, Student s2) -> { return s1.roll - s2.roll; });
		
		System.out.println("\nAfter sorting based on Roll: ");
		list.forEach(s -> System.out.println(s));
		
		Collections.sort(list, (Student s1, Student s2) -> { 
			return s1.age - s2.age; 
			});
		System.out.println("\nAfter sorting based on Age: ");
		list.forEach(s -> System.out.println(s));
	}

}
