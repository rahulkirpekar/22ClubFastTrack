package threadtopic.threadapp;
public class TestApp 
{
	public static void main(String[] args) 
	{
		Table resource = new Table();
		MyThread1 th1 = new MyThread1(resource);
		MyThread2 th2 = new MyThread2(resource);
		MyThread3 th3 = new MyThread3(resource);
		th1.start();
		th2.start();
		th3.start();
		
	}
}
