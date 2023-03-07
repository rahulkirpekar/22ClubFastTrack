import java.util.Scanner;

// pure/Strong Encapsulation--JavaBean
// 
public class Student 
{
	private int rno;
	private String name;
	private int std;
	
//	public Student() 
//	{
//		System.out.println(rno + " "+ name + " "+std);
//		rno=1;
//		name="rahul";
//		std=12;
//		System.out.println("Default Constructor exit");
//	}
//	public Student(int rno,String name) 
//	{
//		this();
//		this.rno=rno;
//		this.name=name;
//	}
//	public Student(int rno,String name,int std) 
//	{
//		this(rno,name);
//		this.std=std;
//	}
//	public Student(Student s) 
//	{
//		this.rno=s.rno;
//		this.name=s.name;
//		this.std=s.std;
//	}
	public void scan() 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rno : ");
		rno = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name : ");
		name = sc.nextLine();
		System.out.println("Enter Std : ");
		std = sc.nextInt();
	}
	public void disp() 
	{
		System.out.println(rno + " "+ name + " " +std + " " + this);
	}
}

