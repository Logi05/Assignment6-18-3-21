package test1;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableTest {
public static void main(String args[]) {
	ArrayList<Student> list=new ArrayList<Student>();
	list.add(new Student(1,20,"priya","IT"));
	list.add(new Student(3,18,"Gayathri","EEE"));
	list.add(new Student(5,21,"Ram","ECE"));
	list.add(new Student(2,19,"Logi","CSE"));
	
	Collections.sort(list);
	
	for(Student s:list)
	{
		System.out.println(s.rollNo+" "+s.age+" "+s.name+" "+s.Dep);
	}
}
}
