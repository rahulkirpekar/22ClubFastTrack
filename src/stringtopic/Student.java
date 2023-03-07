package stringtopic;

public class Student 
{
	int rno;
	String name;
	int std;
	
	public Student(int rno, String name, int std) 
	{
		this.rno = rno;
		this.name = name;
		this.std = std;
	}
	@Override
	public boolean equals(Object obj) 
	{
		Student s2 = (Student)obj;
		return name.equals(s2.name);
	}
	public static void main(String[] args) 
	{
		Student s1 = new Student(1, "rahul", 12);
		Student s2 = new Student(1, "rahul", 12);
				
		System.out.println("s1.equals(s2) - " + s1.equals(s2));// true
//		System.out.println("(s1==s2) - " + (s1==s2));
		
	}

}
