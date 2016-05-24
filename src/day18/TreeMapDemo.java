package day18;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		TreeMap<Student, Integer> tm = new TreeMap<Student, Integer>(new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				int num = o1.getAge() - o2.getAge();
				int num2 = num == 0 ? o1.getName().compareTo(o1.getName()) : num;

				return num2;
			}
		});

		Student s = new Student("����", 80);
		Student s2 = new Student("����", 80);
		Student s3 = new Student("����", 380);
		Student s4 = new Student("����", 280);
		Student s5 = new Student("����", 180);
		Student s6 = new Student("����", 820);
		Student s7 = new Student("����", 80);

		tm.put(s, 300);
		tm.put(s2, 305);
		tm.put(s3, 330);
		tm.put(s4, 320);
		tm.put(s5, 310);
		tm.put(s6, 320);
		tm.put(s7, 360);

		Set<Student> set = tm.keySet();

		for (Student student : set) {
			System.out.println(student.getName() + ":" + student.getAge() + ":" + tm.get(student));
		}
	}
}
