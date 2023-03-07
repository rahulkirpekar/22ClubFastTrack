package oops.finaltopic;

import java.util.Scanner;
public class TestApp1
{
	// Data Member
	final int no;
	public TestApp1() 
	{
		no=10;
	}
	public TestApp1(int no) 
	{
		this.no=no;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter No : ");
		int no = new Scanner(System.in).nextInt();
		
		TestApp1 obj = new TestApp1(no);
		
		System.out.println("No1 : " + obj.no);
	}
}