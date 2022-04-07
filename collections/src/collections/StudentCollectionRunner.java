package collections;

import java.util.List;

public class StudentCollectionRunner {

	public static void main(String[] args) {

		List<Student> students = List.of(new Student(1, "Ranga"), new Student(100, "Adam"), new Student(2, "Eve"));
		System.out.println(students);

	}

}
