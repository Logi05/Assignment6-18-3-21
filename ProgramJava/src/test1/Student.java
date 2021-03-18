package test1;

 class Student implements Comparable<Student>
 {
	 int rollNo,age;
	 String name,Dep;
	 
	 

	public Student(int rollNo, int age, String name, String dep) {
		super();
		this.rollNo = rollNo;
		this.age = age;
		this.name = name;
		Dep = dep;
	}
	@Override
	public int compareTo(Student st) {
		if(this.rollNo==st.rollNo)
			return 0;
		else if(this.rollNo>st.rollNo)
			return 1;
		else
			return -1;			
	}
}
