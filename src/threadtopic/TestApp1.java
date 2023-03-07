package threadtopic;

public class TestApp1 
{
	void test1()
	{
		System.out.println("TestApp1---test1()");
		test2();//2
	}
	void test2()
	{
		System.out.println("TestApp1---test2()");
		test3();//3
	}
	void test3()
	{
		System.out.println("TestApp1---test3()");
		test4();//4
	}
	void test4()
	{
		System.out.println("TestApp1---test4()");
	}
	public static void main(String[] args) 
	{
		System.out.println("Thread.currentThread().getName() - " + Thread.currentThread().getName());
		TestApp1 obj = new TestApp1();
		
		obj.test1();//1
		//-------------
	}
}
